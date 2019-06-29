package HackerRank.Interview.TwoStrings;

public class Main {

    public static void main(String[] args) {
        String s1= "Hello";
        String s2="";
        int cnt=0;
        for (int i=0;i < s1.length(); i++){
            for(int j=0; j < s2.length();j++){
                if (s1.charAt(i) == s2.charAt(j)){
                    cnt++;
                }
            }
        }
        if (cnt>0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
