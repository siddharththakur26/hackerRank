package HackerRank.crackingInterview;

import java.util.HashMap;

public class Display {
    public static void main(String[] args) {
        int month = (int) 02d;
        int day = (int) 13d;
        int year = 201;
        HashMap<Integer, Integer> monthcode = new HashMap();
        monthcode.put(01, 11);
        monthcode.put(02, 12);
        monthcode.put(03, 01);
        monthcode.put(04, 02);
        monthcode.put(05, 03);
        monthcode.put(06, 04);
        monthcode.put(07, 05);
        monthcode.put((int) 08d, 06);
        monthcode.put((int) 09d, 07);
        monthcode.put(10, (int)08d);
        monthcode.put(11, (int) 09d);
        monthcode.put(12, 10);
        String days[] = new String[7];
        days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (year%4==0)
            year=year-1;

        int last2digit = Integer.parseInt(String.valueOf(year).substring(2));
        int first2digit = Integer.parseInt(String.valueOf(year).substring(0,2));

        int value;
        System.out.println(monthcode.get(month));
        value =  day +((13*monthcode.get(month)-1)/5) + last2digit + (last2digit/4) + (first2digit/4) - (2*first2digit);
        System.out.println(value);
        int index=0;
        if (value < 0){
            if (value%7 !=0)
                index = (value%7)+7;
        }
        else{
            index = value%7;
        }
        System.out.println(index);

        System.out.println(days[index]);

    }

}
/*
HashMap<Integer, Integer> monthcode = new HashMap();
        monthcode.put(01, 1);
        monthcode.put(02, 4);
        monthcode.put(03, 4);
        monthcode.put(04, 0);
        monthcode.put(05, 2);
        monthcode.put(06, 5);
        monthcode.put(07, 0);
        monthcode.put((int) 08d, 3);
        monthcode.put((int) 09d, 6);
        monthcode.put(10, 1);
        monthcode.put(11, 4);
        monthcode.put(12, 6);

        HashMap<Integer, Integer> yearcode = new HashMap<>();
        yearcode.put(1700, 4);
        yearcode.put(1800, 2);
        yearcode.put(1900, 0);
        yearcode.put(2000, 6);
 System.out.println(quo+" "+day+" "+monthcode.get(month));
    int rem = last2digit % 4;
        int quo = last2digit / 4;

       value = quo + day + monthcode.get(month);
        System.out.println(value);

       if (year%4==0) {
          if (month==01 || month==02)
           value = value - 1;
          else
              value = value+1;
       }

       int yearcodevalue= year-400;
        System.out.println(yearcodevalue);

       if ((yearcodevalue)>=2000)
           value = value + yearcode.get(2000);
       else if (yearcodevalue>=1900 && yearcodevalue <2000 )
           value = value + yearcode.get(1900);
       else if (yearcodevalue>=1800 && yearcodevalue <1900 )
           value = value + yearcode.get(1800);
       else if (yearcodevalue>=1700 && yearcodevalue <1800 )
           value = value + yearcode.get(1700);

       value = value + last2digit;
        System.out.println(value);

       value = value%7;
        System.out.println(value);
          System.out.println(monthcode.get(days[index]));

       }
 */