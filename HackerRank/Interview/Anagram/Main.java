package HackerRank.Interview.Anagram;

/*
Sample Input
cde
abc
Sample Output
4
 */
public class Main {
    public static void main(String[] args) {
        String s1="cde";
        String s2="dcf";
        int [] charcounts1 = getCharCount(s1);
        int [] charcounts2 = getCharCount(s2);
        System.out.println(getdelta(charcounts1,charcounts2));
    }
    static int getdelta(int [] charcounts1, int [] charcounts2){
         if (charcounts1.length != charcounts2.length){
             return -1;
         }
         int delta=0;
         for (int i=0; i<charcounts1.length;i++){
             int diff = Math.abs(charcounts1[i] - charcounts2[i]);
             System.out.println(diff);
             delta = delta + diff;
         }
         return delta;
    }
    static int [] getCharCount(String array){
        int charcount[]=new int[26];
        for (int i=0; i<array.length();i++){
            char c= array.charAt(i);
           // int value = (int) c;
          //  System.out.println(value);
            int offset = (int) 'a';
          //  System.out.println(offset);
            int code = c - offset;
           // System.out.println(code);
            charcount[code]++;
        }
       // System.out.println(Arrays.toString(charcount));
        return charcount;
    }
}
