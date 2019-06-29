package HackerRank.Implementation;

import java.util.Arrays;
import java.util.HashMap;

/*
Complete the permutationEquation function in the editor below. It should return an array of integers that represent the values of .

permutationEquation has the following parameter(s):

p: an array of integers
 */
public class SequenceEquation {
    public static void main(String[] args) {
        int [] p = {4 ,3 ,5 ,1 ,2};

        int k=1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<p.length;i++){
            map.put(p[i],k);
            k++;
        }
        int z=0;
        System.out.println(map);
        int [] result = new int[p.length];
        for (int i=1;i<=map.size();i++){
            int index = map.get(i);
            result[z] = map.get(index);
            z++;
            System.out.println(map.get(index));

        }
        System.out.println(Arrays.toString(result));

    }
}
