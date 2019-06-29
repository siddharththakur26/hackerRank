package HackerRank.Interview.CountingValley;

public class Main {
    public static void main(String[] args) {
        int n = 8;
        String  s ="UDDDUDUU";
        int countu=0;
        int countd=0;
        for (int i =0 ; i< n; i++){
            if (s.charAt(i) == 'D') {
                countd++;
                if (s.charAt(i) == 'U' && countd == 2) {
                    countd=0;
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        countu++;
                        i++;
                    }
                }
            }
        }
        System.out.println(countu);
    }
}
