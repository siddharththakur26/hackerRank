package HackerRank.Interview.AbsoluteDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //int [] arr= {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        //int [] arr = {1 ,-3, 71, 68, 17};
        int [] arr= {3,-7,0};
        System.out.println(calculateMinDiffm2(arr));
    }
    static int calculateMinDiffm2(int [] arr){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        //System.out.println(min);
        for (int i=1; i< arr.length;i++){
            min= Math.min(min,Math.abs(arr[i]- arr[i-1]));
        }
        return min;

    }
    static int calculateMinDiffm1(int [] arr){
        ArrayList<Integer> diff= new ArrayList<>();
        int k=0;
        for (int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length; j++) {
                diff.add(Math.abs(arr[i] - arr[j]));
            }
        }
        Collections.sort(diff);
        System.out.println(diff);
        return diff.get(0);
    }
}
