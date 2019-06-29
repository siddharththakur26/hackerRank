package HackerRank.StringsManipulation;

/*
Verify the string(in the form of sentence) consist of all the alphabets
 */

public class Pangrams {
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the prize";
        int ch[] =new int[26];


        String temp = s.toLowerCase();
        //System.out.println(temp);
        for (int i =0;i<temp.length();i++){
            if (temp.charAt(i)!= ' ' && temp.charAt(i) != '.'){
                ch[temp.charAt(i)-'a'] = ch[temp.charAt(i)-'a'] +  1;
            }

        }
        //System.out.println(Arrays.toString(ch));
        int flag=0;
        for (int i=0;i<ch.length;i++){
            if (ch[i] == 0){
                flag = 1;
                break;
            }
        }
        if (flag>0)
            System.out.println("not pangram");
        else
            System.out.println("pangram");
    }
}
