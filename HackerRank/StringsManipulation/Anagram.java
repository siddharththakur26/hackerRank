package HackerRank.StringsManipulation;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "xaxbbbxx";
        int len = s.length();
        int flag =0;
        if (len%2 != 0)
            System.out.println(-1);
        else{
            String s1 = s.substring(0,len/2);
            String s2 = s.substring(len/2);
            System.out.println(s1);
            System.out.println(s2);
            int ch1 []= new int[26];
            int ch2 []= new int[26];
            for (int i=0;i<s1.length();i++){
                ch1[s1.charAt(i)-'a'] = ch1[s1.charAt(i)-'a'] + 1;
                ch2[s2.charAt(i)-'a'] = ch2[s2.charAt(i)-'a'] + 1;
            }
            for (int i=0; i<ch1.length;i++){
                flag = flag + Math.abs(ch1[i] - ch2[i]);
            }
            System.out.println(Arrays.toString(ch1));
            System.out.println(Arrays.toString(ch2));
            System.out.println(flag/2);

        }

    }
}
