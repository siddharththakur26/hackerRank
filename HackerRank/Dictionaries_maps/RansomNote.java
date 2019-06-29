package HackerRank.Dictionaries_maps;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String[] magazine = {"two", "times", "three", "is", "not", "four"};
        String[] note = {"two", "times", "two", "is", "four"};
        HashMap<String,Integer> m = new HashMap<>();
        HashMap<String,Integer> n = new HashMap<>();
        int count=0;
        for (int i = 0; i<magazine.length;i++){
            for (int j=0;j<magazine.length;j++){
                if (magazine[i] == magazine[j])
                    count++;
            }
            m.put(magazine[i],count);
            count=0;
        }
        System.out.println(m);
        count=0;
        for (int i = 0; i<note.length;i++){
            for (int j=0;j<note.length;j++){
                if (note[i] == note[j])
                    count++;
            }
            n.put(note[i],count);
            count=0;
        }
        System.out.println(n);
        boolean bool = true;
        for (String s : n.keySet()){
            if (!m.containsKey(s) || m.get(s) != n.get(s))
                bool=false;
        }
        if (bool)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

/*
    HashSet<String> m = new HashSet<>();
        for (int i=0;i<magazine.length;i++){
            m.add(magazine[i]);
        }
        int cnt=0;

        for (int i=0;i<note.length;i++){
            if (m.contains(note[i])){
                cnt++;
                m.remove(note[i]);
            }
        }

        if (cnt == note.length)
            System.out.println("Yes");
        else
            System.out.println("No");
 */
