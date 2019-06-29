package HackerRank.StringsManipulation;

public class HackerrankInString {
    public static void main(String[] args) {
        String s = "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        String s1 = "hackerrank";
        int j=0;
        for (int i = 0 ;i<s.length();i++){
            if (s.charAt(i) == s1.charAt(j))
                j = j+1;
            if (j == s1.length())
                break;
        }
        if (j==s1.length())
            System.out.println("YES");
        else
            System.out.println("NO");




    }
}
/*
String s= "rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        String s1 = "hackerrank";
        int ch_s[] = new int[26];
        int ch_s1[] = new int[26];

        for (int i=0;i<s.length();i++){
            ch_s[s.charAt(i)-'a'] = ch_s[s.charAt(i)-'a']+1;
        }
        System.out.println(Arrays.toString(ch_s));
        for (int i=0;i<s1.length();i++){
            ch_s1[s1.charAt(i)-'a'] = ch_s1[s1.charAt(i)-'a']+1;

        }
       System.out.println(Arrays.toString(ch_s1));
        int flag=0;
        for (int i=0; i<ch_s1.length;i++){
            if (ch_s1[i] > ch_s[i]){
                flag++;
                break;
            }
        }
        if (flag > 0)
            System.out.println("NO");
        else
            System.out.println("YES");
 */
