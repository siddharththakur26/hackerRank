package HackerRank.Interview.JumpingClouds;

public class Main {
    public static void main(String[] args) {
       //int c [] = {0, 0, 1, 0, 0, 1 ,0};
       int c[] ={0 ,0, 0, 0, 1, 0};
        //int c[] = {0, 0, 0, 1, 0, 0};
        int jump=0;
        for (int i=0; i < c.length-1; i++){
            if (c[i]==0 && i+2 <= c.length-1) {
                if (c[i + 1] == 0 && c[i + 2] != 0 ) {
                    jump++;
                }
                else if (c[i + 2] == 0) {
                    jump++;
                    i = i+1;

                }
            }
            else{
                jump++;
            }
        }
        System.out.println(jump);
    }
}
