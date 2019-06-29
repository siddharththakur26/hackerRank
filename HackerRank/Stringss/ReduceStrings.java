package HackerRank.Stringss;

public class ReduceStrings {
    public static void main(String[] args) {
        String s = "aaabcccddd";
        int index=0;
        int cnt=1;
        String str="";
        for (int i = 0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (s.charAt(i)!=s.charAt(j)){
                    index =j;
                }
                break;
            }

        }



        System.out.println(index);
    }
}
