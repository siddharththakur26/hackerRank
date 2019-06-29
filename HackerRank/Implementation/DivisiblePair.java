package HackerRank.Implementation;
/*
Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.

divisibleSumPairs has the following parameter(s):

n: the integer length of array
ar: an array of integers
k: the integer to divide the pair sum by
 */

public class DivisiblePair {
    public static void main(String[] args) {
        int n =6;
        int k= 3;
        int [] ar = {1, 3, 2 ,6 ,1 ,2};
        int count=0;
        for (int i=0;i< ar.length;i++){
            for (int j=i+1;j<ar.length;j++){
                int sum = ar[i] + ar[j];
                if (sum%k==0)
                    count++;
            }
        }
        System.out.println(count);
    }

}
