package HackerRank.StringsManipulation;

import java.util.HashSet;

public class StringConstruction {
    public static void main(String[] args) {
        String s = "abab";
        int index=0;
        HashSet<String> s1 = new HashSet<>();
        for (int i = 0; i < s.length();i++){
            s1.add(String.valueOf(s.charAt(i)));
        }
        int result = s1.size();
        System.out.println(result);



     }
}
