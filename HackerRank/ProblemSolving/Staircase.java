package HackerRank.ProblemSolving;

public class Staircase {
    /*0 1 2 3
    0       #
    1     # #
    2   # # #
    3 # # # #
     */
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i< n; i++){
            for (int j=0 ; j< n; j++){
                //compute for spaces
                if (Math.abs(i-n+1) > j)
                    System.out.print(" ");
                //print #
                else if (j >= (Math.abs(i-n+1)))
                    System.out.print("#");
                if (j == n-1 )
                    System.out.println();
            }
        }
    }
}
