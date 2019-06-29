package HackerRank.StringsManipulation;

import java.util.Arrays;
/*
= [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z];
string = aab
out = [2,1,0,0,0,0,0,...]
string = abc
out = [1,1,1,0,0,0,0,0,0.. ]
*/
public class makeAnagram {
    public static void main(String[] args) {
        String a = "aab";
        String b = "ab";
        //changing to lower case
        a = a.toLowerCase();
        b = b.toLowerCase();
        // array = size of the alphabets
        int [] temp1 = new int[26];
        int [] temp2 = new int[26];
        // number of characters in a string
        for (int i=0;i<a.length();i++){
            temp1[a.charAt(i)-'a'] =temp1[a.charAt(i)-'a']+1 ;
        }
        for (int i=0;i<b.length();i++){
            temp2[b.charAt(i)-'a'] = temp2[b.charAt(i)-'a']+1;
        }
        System.out.println(Arrays.toString(temp1));
        System.out.println(Arrays.toString(temp2));
        int result =0;
        for (int i =0;i<26;i++){
            result = result + Math.abs(temp1[i]-temp2[i]);
        }
        System.out.println(result);

    }
}
