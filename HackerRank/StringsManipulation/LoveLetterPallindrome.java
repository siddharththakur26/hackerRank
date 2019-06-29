package HackerRank.StringsManipulation;

public class LoveLetterPallindrome {
    public static void main(String[] args) {
        String s = "cba";
        int n = s.length();
        int count =0;
        for (int i=0, j=n-1; i <=j;){
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);

            if (c1 != c2){
                count = count + Math.abs(s.charAt(i) - s.charAt(j));
            }
            i++;
            j--;
        }
        System.out.println(count);

    }
}
