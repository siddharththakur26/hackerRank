package HackerRank.Interview.SockMerchant;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int ar[] ={10, 20, 20, 10, 10, 30, 50, 10};
        int n = ar.length;
        int count=0;
        Arrays.sort(ar);
       for (int i = 0; i< ar.length; i++){
           for (int j =i+1 ; j< ar.length; j++){
               if (ar[i] == ar[j]){
                   count ++;
                   i++;
                   break;
               }
           }
       }
        System.out.println(count);

    }
}
