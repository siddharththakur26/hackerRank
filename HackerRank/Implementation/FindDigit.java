package HackerRank.Implementation;

import java.util.ArrayList;

/*
Complete the findDigits function in the editor below. It should return an integer representing the number of digits of  that are divisors of .

findDigits has the following parameter(s):

n: an integer to analyze

 */
public class FindDigit {
    public static void main(String[] args) {
        int n = 11;
        int temp = n;
        System.out.println(n%2);
        ArrayList<Integer> digits = new ArrayList<>();
        while(temp > 0){
            int div = temp /10;
            int rem = temp % 10;
            digits.add(rem);
            //System.out.println(n);
            temp = div;
        }

        System.out.println(digits);

        int result=0;
        for (int i =0 ; i<digits.size();i++) {
            if (digits.get(i)!=0){
                if (n % digits.get(i) == 0)
                    result++;
            }

        }
        System.out.println(result);
    }
}
