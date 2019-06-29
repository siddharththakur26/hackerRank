package HackerRank.StringsManipulation;

public class SeparateNumbers {
    public static void main(String[] args) {
        String s = "999100010001";
        int flag = 0;
        long result=0;

        //System.out.println(seq.length());
        for (int i=1;i<=s.length();i++){
            long firstNumber = Long.parseLong(s.substring(0,i));
            StringBuilder seq = new StringBuilder();
            long number = firstNumber;
            while(seq.length() < s.length()){
                seq.append(number);
                number++;
                //System.out.println(seq);
            }
            if (seq.toString().equals(s)) {
                flag++;
                if (firstNumber ==  Long.parseLong(s))
                    flag--;
                result = firstNumber;
                break;
            }

        }
        if (flag>0)
            System.out.println("YES"+'\t'+ result);
        else
            System.out.println("NO");
    }
}
