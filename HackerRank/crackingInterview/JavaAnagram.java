package HackerRank.crackingInterview;

import java.util.Arrays;

public class JavaAnagram {
    public static void main(String[] args) {
        String a ="hello";
        String b="hello";
        char cha[]=new char[a.length()];
        char chb[]=new char[b.length()];
        int k=0;
        char temp;
        for (int i = 0; i < a.length();i++){
            cha[i]=Character.toLowerCase(a.charAt(i));

            }
        for (int i =0; i<cha.length-2;i++){
            if (cha[i]>cha[i+1]){
                temp = cha[i];
                cha[i] = cha[i+1];
                cha[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(cha));

        int counta[]= new int[cha.length];

        int cnt=0;
        for (int i =0; i<cha.length;i++){
            for (int j = 0; j<cha.length;j++){
                if ( cha[i] == cha[j] && !(cha[i] ==0) ){
                    cnt++;
                }

            }

           counta[i]=cnt;
            cnt=0;
        }
        System.out.println(Arrays.toString(cha));

        System.out.println(Arrays.toString(counta));

        for (int i = 0; i < b.length();i++){
            chb[i]=Character.toLowerCase(b.charAt(i));
        }

        cnt=0;

        for (int i =0; i<chb.length;i++){
            for (int j = 0; j<chb.length;j++){
                if ( chb[i] == chb[j]){
                    cnt++;
                }
            }
            //countb.put(chb[i], cnt);
            cnt=0;
        }
       //System.out.println(countb);
        int flag=0;
        //if (!(counta.equals(countb))){
            System.out.println("Not Anagrams");;
        //}
        //else
        //    System.out.println("Anagrams");

    }
}


/*
Using Hasmap

 String a ="Helslo";
        String b="hello";
        char cha[]=new char[a.length()];
        char chb[]=new char[b.length()];
        HashMap<Character,Integer> counta = new HashMap<>();
        HashMap<Character,Integer> countb = new HashMap<>();
        for (int i = 0; i < a.length();i++){
                cha[i]=Character.toLowerCase(a.charAt(i));
        }

        int cnt=0;
        for (int i =0; i<cha.length;i++){
            for (int j = 0; j<cha.length;j++){
                if ( cha[i] == cha[j]){
                    cnt++;
                }
            }
            counta.put(cha[i], cnt);
            cnt=0;
        }

        System.out.println(counta);

        for (int i = 0; i < b.length();i++){
            chb[i]=Character.toLowerCase(b.charAt(i));
        }

        cnt=0;

        for (int i =0; i<chb.length;i++){
            for (int j = 0; j<chb.length;j++){
                if ( chb[i] == chb[j]){
                    cnt++;
                }
            }
            countb.put(chb[i], cnt);
            cnt=0;
        }
       System.out.println(countb);
        int flag=0;
        if (!(counta.equals(countb))){
            System.out.println("Not Anagrams");;
        }
        else
            System.out.println("Anagrams");

____________
int cnt=0;

        if (cha.length==chb.length) {
            for (int i = 0; i < cha.length; i++) {
                for (int j = 0; j < chb.length; j++) {

                    if (cha[i] == chb[j]) {
                        cha[i] = '\0';
                        chb[j] = '\0';
                    } else if (Character.toLowerCase(cha[i]) == Character.toLowerCase(cha[j])) {
                        cha[i] = '\0';
                        chb[j] = '\0';
                    }

                }
            }
            for (int i = 0; i < cha.length; i++) {
                if (cha[i] == '\0')
                    cnt++;
            }

        }
        else{
            System.out.println("Not Anagrams");
        }
        System.out.println(Arrays.toString(cha)+" "+Arrays.toString(chb)+" "+cnt);
 */
