package HackerRank.Implementation;
/*
Complete the beautifulDays function in the editor below. It must return the number of beautiful days in the range.

beautifulDays has the following parameter(s):

i: the starting day number
j: the ending day number
k: the divisor
 */
public class BeautifulDays {
    public static void main(String[] args) {
        int i= 20;
        int j = 23;
        int k = 6;
        String str="";
        int count=0;

        for (int number=i;number<=j;number++){
            int temp = number;
            while(temp > 0){
                int div = temp /10;
                int rem = temp % 10;
                if (rem == 0){
                    if (str != ""){
                        str = str + rem;
                    }
                }
                else{
                    str = str + rem;
                }
                temp = div;
            }
            //System.out.println(str);
            int n = Integer.parseInt(str);

            if (Math.abs(number-n)%k == 0)
                count ++;

            str="";

        }
        System.out.println(count);




    }
}
/*

 */