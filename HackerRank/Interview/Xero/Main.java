package HackerRank.Interview.Xero;

public class Main {
    public static void main(String[] args) {
        String array = "helloworld aaaaaaa";
        int charcount[] = new int[256];
        for (int i = 0; i < array.length(); i++) {
            char c = array.charAt(i);
            // int value = (int) c;
            //  System.out.println(value);
            int offset = (int) 'a';
            //  System.out.println(offset);
            int code = c - offset;
            // System.out.println(code);
            charcount[code]++;
        }
        int max= Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < charcount.length;i++){
            if (charcount[i] > max){
                max = charcount[i];
                index = i;
            }
        }
        char letter = (char) ('a' + index);
        System.out.println(letter);

    }

 }

