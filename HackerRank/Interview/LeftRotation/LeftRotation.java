package HackerRank.Interview.LeftRotation;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [] ar={1,2,3,4,5};
        int rotate=ar.length-2;
        int [] newar=new int[ar.length];
        int cnt=0;
        for (int i=rotate;i<ar.length;i++){
            newar[cnt]=ar[i];
            cnt++;
        }
        //count the remaining elements
        int cnt_rem=ar.length-rotate;
        for (int i=0;i<rotate;i++){
            newar[cnt_rem]=ar[i];
            cnt_rem++;
        }
        System.out.println(Arrays.toString(newar));


    }
}
