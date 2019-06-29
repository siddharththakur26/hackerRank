package HackerRank.HackerWorld.Recursion;

import java.util.Scanner;

public class Main {
    static int factorial(int n) {
       int fact;
        if (n>1){
           fact=n*factorial(n-1);
           return fact;
       }

           return 1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
