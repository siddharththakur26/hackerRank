package HackerRank.StringsManipulation;

import java.util.HashSet;
/*
check how many characters are there in array of strings. dont count duplicate characters within a string
 */

public class Gemstones {
    public static void main(String[] args) {
        String arr[] = {"abcdde", "baccd", "eeabg"};
        int [] ch = new int[26];
        for (int i=0; i<arr.length;i++){
            String s  = arr[i];
            HashSet<Character> temp = new HashSet<>();
            for (int j=0;j<s.length();j++){
                if (!(temp.contains(s.charAt(j)))) {
                    ch[s.charAt(j) - 'a'] = ch[s.charAt(j) - 'a'] + 1;
                    temp.add(s.charAt(j));
                }
            }
            temp.clear();
        }
        //System.out.println(Arrays.toString(ch));
        int flag=0;
        for (int i=0;i<ch.length;i++){
            if (ch[i] == arr.length)
                flag++;
        }
        System.out.println(flag);

    }
}
