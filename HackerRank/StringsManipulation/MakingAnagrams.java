package HackerRank.StringsManipulation;

import java.util.Arrays;

/*
how many characters need to be removed to make an anagram.
two strings are given. How many characters are need to be removed from one string to make an anagram of
second string i.e same letters in same number of occurances
 */
public class MakingAnagrams {
    public static void main(String[] args) {
        String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj";
        String s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";
        int [] p1 =new int[26];
        int [] p2 =new int[26];
        for (int i=0;i<s1.length();i++){
            p1[s1.charAt(i)-'a'] = p1[s1.charAt(i)-'a'] +1;
        }
        System.out.println(Arrays.toString(p1));
        for (int i=0;i<s2.length();i++){
            p2[s2.charAt(i)-'a'] = p2[s2.charAt(i)-'a'] +1;
        }
        System.out.println(Arrays.toString(p2));
        int result;
        int flag =0;

        for (int i=0;i<26;i++){
            result = Math.abs(p1[i] - p2[i]);
            if (result !=0 )
                flag = flag + result;
        }
        System.out.println(flag);
    }
}
