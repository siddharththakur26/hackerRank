package HackerRank.StringsManipulation;

import java.util.Arrays;

public class sherlockValidString {
    public static void main(String[] args) {
        String s = "abcdefghhgfedecba";
        int [] count_chars = new int[26];
        for (int i=0;i<s.length();i++){
            count_chars[s.charAt(i)-'a'] = count_chars[s.charAt(i)-'a'] + 1;
        }
        System.out.println(Arrays.toString(count_chars));
        int freq1=0;
        int count_freq1 =0;
        int i=0;
        for (i= 0 ; i<26;i++){
            if (count_chars[i] != 0){
                freq1 = count_chars[i];
                count_freq1 = 1;
                break;
            }
        }
        int freq2=0,count_freq2=0;
        int j;
        for (j = i+1 ; j<26;j++){
            if (count_chars[j]!=0){
                if (freq1 == count_chars[j]){
                    count_freq1++;
                }
                else
                {
                    freq2 = count_chars[j];
                    count_freq2=1;
                    break;
                }

            }
        }
        for (int k = j+1;k<26;k++){
            if (count_chars[k]!=0){
                if (freq1 == count_chars[k])
                    count_freq1++;
                if (freq2 == count_chars[k])
                    count_freq2++;
                else
                    System.out.println("No");
            }

            if (count_freq1 > 1 && count_freq2>1)
                System.out.println("No");

        }
    }
}
