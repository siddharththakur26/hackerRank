package HackerRank.Interview.AlternativeStrings;

public class AlternatingStrings {
    public static void main(String[] args) {
        String s = "AAABBB";
        System.out.println(calculateNumberofDeletion(s));
    }
    static int calculateNumberofDeletion(String s){
        int count=0;
        for (int i= 0;i< s.length()-1;i++){
            if (s.charAt(i) == s.charAt(i+1)){
                //s.charAt(i+1) = '\0';
                count++;
            }
        }
        return count;
    }

}
