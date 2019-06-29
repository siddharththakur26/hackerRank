package HackerRank.Interview.Xero;

public class BlackJack {
    public static void main(String[] args) {
        int a=11;
        int b=12;
        System.out.println(printsum(a,b));
    }

    private static int printsum(int a, int b) {
        int sum=0;
        if (a == 11){
            a =1;
        }
        if (b ==11){
            b=1;
        }
        sum=a+b;

        return sum;

    }
}
