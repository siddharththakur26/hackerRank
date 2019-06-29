package HackerRank.Interview.Xero;

public class MergeString {
    public static void main(String[] args) {
        String s1= "abf";
        String s2= "de";
        int l1=s1.length();
        int l2=s2.length();
        String str[];
        str = new String[l1+l2];
        int k=0;
        int cnt=0;
        //System.out.println(str.length);
        if (l2>=l1) {
            for (int i = 0; i < s1.length(); i++) {
                str[k] = "" + s1.charAt(i);
                k++;
                str[k] = "" + s2.charAt(i);
                k++;
                cnt++;
            }
            for (int j=cnt; j< s2.length();j++){
                str[k] = ""+s2.charAt(j);
                k++;
            }
        }
        else{
            for (int i = 0; i < s2.length(); i++) {
                str[k] = "" + s1.charAt(i);
                k++;
                str[k] = "" + s2.charAt(i);
                k++;
                cnt++;
            }
            for (int j=cnt; j< s1.length();j++){
                str[k] = "" + s1.charAt(j);
                k++;
            }

        }
        String result = "";
        for(int z=0 ; z<k; z++){
            result+=str[z];
        }

        System.out.println(result);
    }
}
