package HackerRank.Dictionaries_maps;

import java.util.Arrays;

public class TwoStrings {
    public static void main(String[] args) {
        String s1 ="hello";
        String s2 ="qql";
        boolean vector[] = new boolean[26];
        System.out.println(Arrays.toString(vector));
        for (int i=0;i<s1.length();i++){
            vector[s1.charAt(i)-'a'] = true;
        }
        //System.out.println(Arrays.toString(vector));
        int flag=0;
        for (int i =0; i < s2.length();i++){
            if (vector[s2.charAt(i)-'a']) {
                flag++;
                break;
            }
        }
        if (flag > 0 )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
/*
  //char [] ch = s1.toCharArray();
        //char [] ch2 = s2.toCharArray();
        HashSet<Character> ch1 = new HashSet<>();
        for (int i=0;i<s1.length();i++){
            ch1.add(s1.charAt(i));
        }
        HashSet<Character> ch2 = new HashSet<>();
        for (int i=0;i<s2.length();i++){
            ch2.add(s2.charAt(i));
        }

        if (ch1.contains(ch2))
            System.out.println("YES");
        else
            System.out.println("NO");
 */
