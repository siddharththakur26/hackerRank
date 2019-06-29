package HackerRank.HackerWorld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String o1 = "", o2 = "";
        Scanner inline = new Scanner(System.in);
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = inline.nextLine();
        }

        for (int k = 0; k <n; k++) {
            str = words[k];

            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    o1 = o1 + str.charAt(i);
                } else {
                    o2 = o2 + str.charAt(i);
                }

            }
            System.out.println(o1 + " " + o2);
            o1 = "";
            o2 = "";

        }
    }
}
