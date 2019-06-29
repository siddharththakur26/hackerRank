package HackerRank.StringsManipulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strongPassword {
    public static void main(String[] args) {
        String password = "AUzs-nV";
        int n = password.length();


        int minnum=0;
        //contains digits or not
        if (!(password.matches(".*\\d.*")))
            minnum++;
        // contains lower case
        int cnt=0;
        for (int i=0;i<n;i++){
            if (Character.isLowerCase(password.charAt(i)))
                break;
            else
                cnt++;
        }
        if (cnt == n)
            minnum = minnum+1;

        // contains upper case
        cnt=0;
        for (int i=0;i<n;i++){
            if (Character.isUpperCase(password.charAt(i)))
                break;
            else
                cnt++;
        }
        if (cnt == n)
            minnum = minnum+1;

        // special character
        Pattern P = Pattern.compile("[!@#$%^&*()-+-]", Pattern.CASE_INSENSITIVE);
        Matcher m = P.matcher(password);
        if (!(m.find()))
            minnum = minnum+1;

        int total = n + minnum;
        //System.out.println(total);
        int temp=0;
        if (total < 6){
            temp = 6 - total;
            minnum = minnum+temp ;
        }
        System.out.println(minnum);


    }
}
