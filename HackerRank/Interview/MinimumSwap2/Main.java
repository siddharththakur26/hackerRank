package HackerRank.Interview.MinimumSwap2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int ar[] = {2,3,4,1,5};
        /*
        Replacing 4 and 1 then
        1,3,4,2
        Replacing 3 and 4
        1,4,3,4
        Replacing 2 and 4
        1,2,3,4
         */
        int temp;
        int count = 0;
        for (int i=0; i < ar.length; i++){
            for (int j=i+1;j < ar.length; j++){
               if (ar[i] > ar[j]){
                   temp = ar[i];
                   ar[i]=ar[j];
                   ar[j]=temp;
                   count ++;
               }
            }

        }
        System.out.println(count);
        System.out.println(Arrays.toString(ar));
    }

}
