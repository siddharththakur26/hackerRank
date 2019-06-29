package HackerRank.StringsManipulation;

import java.util.Arrays;

public class FunnyString {
    public static void main(String[] args) {
        String s ="lmnop";
        int ar1 [] = new int[s.length()];
        for (int i =0;i<s.length();i++){
            int ch1 = s.charAt(i);
            ar1[i] = ch1;
        }
        System.out.println(Arrays.toString(ar1));
        int ar2 [] = new int[s.length()];
        int k =0;
        for (int j =s.length()-1;j>=0;j--){
            int ch2 = s.charAt(j);
            ar2[k] = ch2;
            k++;
        }
        System.out.println(Arrays.toString(ar2));
        int result1[] =new int[s.length()-1];

        for (int i = 0; i<s.length()-1;i++){
            result1[i] = Math.abs(ar1[i] - ar1[i+1]);
        }
        System.out.println(Arrays.toString(result1));
        int result2[] =new int[s.length()-1];

        for (int i = 0; i<s.length()-1;i++){
            result2[i] = Math.abs(ar2[i] - ar2[i+1]);
        }
        System.out.println(Arrays.toString(result2));

        int flag=0;
        for (int i=0;i<result1.length;i++){
            if (result1[i] - result2[i] != 0) {
                flag++;
                break;
            }
        }
        if (flag > 0)
            System.out.println("not funny");
        else
            System.out.println("funny");

    }
}
