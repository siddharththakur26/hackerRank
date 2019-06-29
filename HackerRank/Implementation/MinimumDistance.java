package HackerRank.Implementation;

import java.util.HashMap;

/*
Complete the minimumDistances function in the editor below. It should return the minimum distance between any two matching elements.

minimumDistances has the following parameter(s):

a: an array of integers
 */
public class MinimumDistance {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4 ,10};
        HashMap<Integer,Integer> val = new HashMap<>();
        int min_val = Integer.MAX_VALUE;
        for (int i=0; i <a.length;i++){
            if (val.containsKey(a[i])){
                min_val = Math.min(min_val,i - val.get(a[i]));
            }
            val.put(a[i],i);
        }
        if (min_val == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(min_val);

    }
}
/*
ArrayList<Integer> distances =new ArrayList<>();
        for (int i=0;i<a.length;i++){
            for (int j =i+1; j< a.length;j++){
                if (a[i] == a[j]){
                    int diff = Math.abs(i-j);
                    distances.add(diff);
                }
            }
        }
        //System.out.println(distances);
        int min = Integer.MAX_VALUE;
        int flag=0;
        for (int i=0;i<distances.size();i++){
            if (min > distances.get(i)){
                min = distances.get(i);
                flag++;
            }
        }

        if (flag == 0){
            System.out.println(-1);
        }
        else
            System.out.println(min);
 */