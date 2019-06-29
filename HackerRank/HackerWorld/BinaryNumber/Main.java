package HackerRank.HackerWorld.BinaryNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String str = Integer.toBinaryString(number);
        int count=0;
        int tmp=0,tmp2=0,tmp3=0;
        System.out.println(str);
        for(int i=0;i<str.length();i++){
                if ((str.charAt(i)=='1')) {
                    count++;
                    tmp = count;
                    count=tmp;
                    tmp=0;

                }
                else {
                    tmp2=count;
                    if(tmp2>tmp3)
                    tmp3=tmp2;
                        count = 0;
                }
        }
        if (tmp3>count)
        System.out.println(tmp3);
        else
            System.out.println(count);
    }


}