package HackerRank.Interview.Xero;

public class CountLetterv2 {
    public static void main(String[] args) {
        String txt ="bbaabba";
        int count = 0;
        char letter='\0';
        int times=0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<txt.length();i++) {
            for (int j = 0; j < txt.length(); j++) {
                if (txt.charAt(i) == txt.charAt(j))
                    count++;
            }
            if (count >= max) {
                max=count;
                letter = txt.charAt(i);
            }
            count=0;

        }
        System.out.println(letter+":"+max);


    }
}
