package HackerRank.Implementation;

import java.util.ArrayList;

public class BonAppetit {
    public static void main(String[] args) {
        int ar[] = {3,10,2,9};
        ArrayList<Integer> bill = new ArrayList<>();
        for (int i =0;i <ar.length;i++){
            bill.add(ar[i]);
        }
        int n = bill.size();
        int k = 1;
        int b = 7;
        int b_actual=0;

        int sum=0;
        for (int i=0; i< n;i++){
            if (i != k){
                b_actual = b_actual + bill.get(i);
            }
        }
        b_actual = b_actual /2;
        //System.out.println(b_actual);
        if (b_actual != b)
            System.out.println(Math.abs(b_actual - b));
        else
            System.out.println("Bon Appetit");
    }
}
