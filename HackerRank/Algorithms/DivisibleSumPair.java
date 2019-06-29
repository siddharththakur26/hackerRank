package HackerRank.Algorithms;

public class DivisibleSumPair {
    public static void main(String[] args) {
        int ar[] = {1,3,2,6,1,2};

        int k = 3;
        int n = ar.length;
        int cnt=0;
        //System.out.println(Arrays.toString(ar));
        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                if (ar[i] < ar[j]){
                    int temp = ar[i] + ar[j];
                    if (temp%k==0){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

}
/*
 f
 */
