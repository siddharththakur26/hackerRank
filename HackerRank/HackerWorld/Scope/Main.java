package HackerRank.HackerWorld.Scope;

public class Main {
    public static void main(String[] args) {
        int [] ar={1,3,5};
        int diff=0;
        int maxdiff=0;
        for (int i=0; i< ar.length;i++){
            for (int j=0; j < ar.length;j++)
            diff= Math.abs(ar[i]-ar[j]);
            maxdiff= Math.max(diff,maxdiff);
        }
        System.out.println(maxdiff);
    }
}
