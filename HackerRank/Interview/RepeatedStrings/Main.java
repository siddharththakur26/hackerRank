package HackerRank.Interview.RepeatedStrings;

public class Main {
    public static void main(String[] args) {
        String s= "aab";
        long n = 882787;
        String str="";
        int counta=0;
        for (int i=0; i < s.length();i++){
            if (s.charAt(i) =='a')
                counta++;
        }
        System.out.println( "count of a: "+counta);
        long count=0;
        long group = n / s.length();
        long reminder = n % s.length();
        System.out.println("total no of group: "+group);
        if (group == 0  || group == n){
            if (n < s.length()) {
                for (int i = 0; i < n ; i++){
                    if (s.charAt(i) == 'a')
                        count++;
                }
            }
            else {
                count = counta * group;
                System.out.println("totalcount: " + count);
            }
        }
        else
            {
                count = counta * group;
                System.out.println("totalcount: "+count);
                for (int i = 0 ; i < reminder ;i++)
                {
                    if (s.charAt(i)=='a')
                        count ++;
                }
            }
        System.out.println(count);
        System.out.println(System.currentTimeMillis());



    }
}
