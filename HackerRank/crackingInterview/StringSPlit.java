package HackerRank.crackingInterview;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSPlit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "1,123";
        //String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
        String splitter[];

        splitter = new String[]{"!", ",", ".", "_", "'", " ","@"};
        String ans1="";
        int flag=0;
        ArrayList<String> str= new ArrayList<>();
        for (int i=0;i<s.length();i++){
          for (int j=0; j<splitter.length;j++){
              if (String.valueOf(s.charAt(i))==splitter[j]){
              }

          }

        }
        System.out.println(s.charAt(0));


    }
}

/*
   String s = "Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug  \n" +
                "{-truncated-}\n";
        String splitter[];

        splitter = new String[]{"!", ",", ".", "_", "'", " "};

String ans1[];
        ans1 = s.split(", |! |' |_ |@ |\\? |\\. | |!|,|'|_|@|\\?|\\.|  |\n");
                System.out.println(ans1.length);
                for (int i = 0; i < ans1.length; i++)
        System.out.println(ans1[i]);
 */
