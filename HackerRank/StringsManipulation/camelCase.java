package HackerRank.StringsManipulation;

public class camelCase {
    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        String temp = s.toLowerCase();
        int cnt=1;
        for (int i =0;i<s.length();i++){
            if (s.charAt(i) != temp.charAt(i))
                cnt++;
        }
        System.out.println(cnt);
    }
}
