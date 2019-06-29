package HackerRank.Interview.Xero;

public class CountLetter {
    public static void main(String[] args) {
        String text = "aaabbbcc";
        int [] count = new int[256];
        int length = text.length();
        for (int i = 0; i< length;i++){
            count[text.charAt(i)]++;
        }
        //System.out.println(Arrays.toString(count));
        int max = Integer.MIN_VALUE;
        char result = ' ';
        for (int i = 0; i < length; i++) {
            if (max < count[text.charAt(i)]) {
                max = count[text.charAt(i)];
                result = text.charAt(i);
            }
        }

        System.out.println(result+":"+count);
    }
}
