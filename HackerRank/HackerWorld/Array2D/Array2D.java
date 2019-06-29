package HackerRank.HackerWorld.Array2D;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int ar[][]=new int[2][2];
        Scanner in=new Scanner(System.in);
        int sum[]=new int[ar.length];

        for (int i=0;i<2;i++){
            for (int j=0; j<2;j++){
                ar[i][j]=in.nextInt();
            }
        }
        int n=0,k=0;
        for (int i=0;i<2;i++){
            for (int j=0; j<2;j++){
             n= n+ar[i][j];
             sum[k]=n;
             k++;
            }
        }

        for (int i=0;i<2;i++){
            for (int j=0; j<2;j++){
                System.out.print((ar[i][j])+((j==1)?"\n":" "));
            }
        }
    }
}
