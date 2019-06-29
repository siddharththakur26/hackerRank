package HackerRank.Implementation;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
//        s.add(1);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);
        s.add(4);
        int d = 4; // length of chocolate
        int m = 1; // no of choc0lote

        System.out.println(s);
        int flag=0;
        int result=0;
        if (m > 1) {
            for (int i = 0; i < s.size() - m; i++) {
                int sum = s.get(i);
                for (int j = i + 1; j <= i + m - 1; j++) {
                    result = sum + result + s.get(j);
                    if (result == d) {
                        flag++;
                    }
                    result = 0;
                }
            }
        }
        else
        {
            if (d == s.get(0))
                flag++;
        }
        System.out.println(flag);

    }
}
