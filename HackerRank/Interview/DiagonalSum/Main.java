package HackerRank.Interview.DiagonalSum;
/*
1 2 3
4 5 6
9 8 9
The left-to-right diagonal = 15 . The right to left diagonal = 17. Their absolute difference is 2.

Function description
 */
public class Main {
    public static void main(String[] args) {
        int sum1=0, sum2=0, sum;
        int [] [] arr= {
                {11,2,4},
                {4, 5 ,6},
                {10,8,-12}
        };
        for (int i=0; i< arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(i == j){
                    sum1= sum1 + arr[i][j];
                }
            }
        }
        for (int i=0; i< arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (((i + j) == arr.length - 1)) {
                    sum2 = sum2 + arr[i][j];
                }
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);
        sum = Math.abs(sum1-sum2);
        System.out.println(sum);
    }
}
