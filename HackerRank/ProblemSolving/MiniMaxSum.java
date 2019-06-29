package HackerRank.ProblemSolving;

import java.util.Arrays;

public class MiniMaxSum {
    public static void main(String[] args) {
        long [] arr={1 ,2 ,3, 4, 5};
        Arrays.sort(arr);
        long minisum=0,maxsum=0;
        for (int i=0;i<arr.length-1;i++)
            minisum+=arr[i];
        for (int i=arr.length-1; i > 0; i--)
            maxsum+=arr[i];
        System.out.print(minisum);
        System.out.print(" "+maxsum);

    }
}
