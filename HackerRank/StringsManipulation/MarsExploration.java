package HackerRank.StringsManipulation;

public class MarsExploration {
    public static void main(String[] args) {
        String s = "SOSSOSSOS";
        String s1= "SOS";
        String temp = "";
        int len = s.length()/3;
        for (int i=0; i <len;i++){
            temp = temp + s1;
        }
        //System.out.println(temp);
        int flag=0;
        for (int i =0;i<s.length();i++){
            if (temp.charAt(i) != s.charAt(i))
                flag++;
        }
        System.out.println(flag);
    }
}
