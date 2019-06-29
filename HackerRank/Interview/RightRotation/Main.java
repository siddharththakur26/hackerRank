package HackerRank.Interview.RightRotation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        int rotate=ar.length-2;
        int []newar=new int[ar.length];
        int count=0;
        for (int i=rotate-1;i<ar.length;i++){
            newar[count]=ar[i];
            count++;
        }
        int count_reamining=ar.length-rotate;
        for (int i=0;i<count_reamining;i++){
            newar[count]=ar[i];
            count++;
        }
        System.out.println(Arrays.toString(newar));

    }
}
