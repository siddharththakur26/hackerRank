package HackerRank.Implementation;

import java.util.Arrays;
import java.util.HashSet;

public class BreakRecords {
    public static void main(String[] args) {
        int [] scores= {3,4,21,36,10,28,35,5,24,42};
        int max = scores[0];
        int min = scores[0];
        int max_arr[] = new int[scores.length];
        for (int i=0;i<scores.length;i++){
            if (max < scores[i])
                max = scores[i];
            max_arr[i] = max;
        }
        System.out.println(Arrays.toString(max_arr));
        int min_arr[] = new int[scores.length];
        for (int i=0;i<scores.length;i++){
            if (min > scores[i])
                min = scores[i];
            min_arr[i] = min;
        }
        System.out.println(Arrays.toString(min_arr));

        HashSet<Integer> count_max =new HashSet<>();
        for (int i=0;i<max_arr.length;i++){
            count_max.add(max_arr[i]);
        }
        HashSet<Integer> count_min =new HashSet<>();
        for (int i=0;i<min_arr.length;i++){
            count_min.add(min_arr[i]);
        }
        int [] result = {count_max.size()-1,count_min.size()-1};
        System.out.println(Arrays.toString(result));

    }
}
