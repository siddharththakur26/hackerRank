package HackerRank.crackingInterview;

import java.util.ArrayList;

public class SlidingWindow {
    public static void main(String[] args) {
        String str ="abcabcbb";
        ArrayList<Character> arr = new ArrayList<>();
        int length=0;
        String sol ="";
        for (int i=0; i<str.length();i++){
            arr.add(str.charAt(i));
        }
        System.out.println(arr);
        for (int i=0;i<str.length();i++){
             sol = sol + arr.get(i);
             if (sol.length()>1){
                 length = sol.length();
                 for (int j =i ; j<str.length();j++){
                     String ss= str.substring(j,j+length);
                     if ((j+length<str.length()) && sol == ss){
                         System.out.println(sol);
                     }
                 }

             }
        }
    }
}
