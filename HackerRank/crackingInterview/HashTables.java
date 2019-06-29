package HackerRank.crackingInterview;

import java.util.HashSet;
import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {

        String [] magazine = {"give", "me", "one", "grand", "today","night"};//{"ive","got","a","lovely","bunch","of","coconuts"};//{"ive","got","a","lovely","bunch","of","coconuts"};//{"two","times","three","is","not","four"};
        String [] note = {"give", "one", "grand","today"};;//{ "two","times","two","is","four"};//{"ive","got","some","coconuts"};//{ "two","times","two","is","four"};
        Hashtable<String,Integer> countm = new Hashtable<>();
        Hashtable<String,Integer> countn = new Hashtable<>();
        int cnt=0;
        HashSet<String> tempm=new HashSet<>();
        HashSet<String> tempn=new HashSet<>();

        for (int i=0;i<note.length;i++){
                tempn.add(note[i]);
        }


        for (int i=0;i<magazine.length;i++){
                    tempm.add(magazine[i]);
            }


        for (int i=0;i<magazine.length;i++) {
            for (int j = 0; j < magazine.length; j++) {
                if (magazine[i]==magazine[j])
                    cnt++;
            }
            countm.put(magazine[i], cnt);
            cnt=0;
        }
        System.out.println(countm);
        cnt=0;
        for (int i=0;i<note.length;i++) {
            for (int j = 0; j < note.length; j++) {
                if (note[i]==note[j])
                    cnt++;
            }
            countn.put(note[i], cnt);
            cnt=0;
        }
          System.out.println(countn);


        int flag=0;
        for (int i=0;i<magazine.length;i++){
            if (countn.get(magazine[i])!= countm.get(magazine[i]) && countn.get(magazine[i])!=null ){
               flag++;
            }
        }

        if(flag>0){
            System.out.println("No");
        }
        else
            System.out.println("Yes");


    }
}
