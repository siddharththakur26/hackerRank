package HackerRank.Interview.HourGlass;
public class Main {
    public static void main(String[] args) {
        int [][]arr ={
                {  1,  0, 12, -1 },
                {  7, -3,  2,  5 },
                { -5, -2,  2, -9 },
                { -5, -2,  2, -9 }
        };
        System.out.println(hourglass(arr));
    }
    static int  hourglass(int[][] arr){
        int max=Integer.MIN_VALUE;
        int temp;
        for (int i=0;i<2;i++){
            for (int j=0; j<2; j++){
                temp = arr[i][j]+arr[i][j+1]+arr[i][j+2] //1st row
                + arr[i+1][j+1] //2nd row
                + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];  //3rd row
                max=Math.max(temp,max);
            }
        }

        return max;
    }
}
/*
1 2 3 4 5 6
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1
1 1 1 1 1 1

 */

