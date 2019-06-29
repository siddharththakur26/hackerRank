package HackerRank.crackingInterview;

public class ReverseString {
    public static void main(String[] args) {
        String A ="131";
        String reverse="";

        for (int i=A.length()-1;i>=0;i--){
            reverse=reverse+A.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
