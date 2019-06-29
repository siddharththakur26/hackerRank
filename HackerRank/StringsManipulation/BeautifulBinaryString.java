package HackerRank.StringsManipulation;

public class BeautifulBinaryString {
    public static void main(String[] args) {
        String b = "0100101010";
        StringBuilder bb = new StringBuilder(b);
        int flag=0;
        for (int i =0; i<b.length()-2;i++){
            String temp = bb.substring(i,i+3);
            System.out.println(temp);
            if (temp.equals("010")){
                bb.setCharAt(i+2,'1');
                //System.out.println(bb);
                flag++;
            }

        }
        System.out.println(flag);
    }
}
