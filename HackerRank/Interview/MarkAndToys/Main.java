package HackerRank.Interview.MarkAndToys;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int k = 50;
        int [] prices={1,12,5,111,200,1000,10};
        System.out.println(findNotoys(prices,k));
    }
    static int findNotoys(int [] prices, int k){
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
        int sum=0;
        int count=0;
        for (int i = 0 ; i< prices.length; i++){
            if (sum <= k){
                sum=sum+prices[i];
                count++;
            }

        }
        return count-1;

    }
}


