package HackerRank.crackingInterview;

public class Example123 {
    public static void main(String[] args) {
        String s = "1,234,2";
        String ans = "";
        String ans1="";
        int final_index=0,initial_index=0;
        char split[]={',',' '};
        for (int i=0;i<s.length();i++) {
            for (int j = 0; j < split.length; j++) {
                if (s.charAt(i) == split[j] ) {
                    break;
                }
                else{
                    ans= ""+s.charAt(i);
                    ans1 =  ans;

                }
            }

        }
        System.out.println(ans1);
    }
}
