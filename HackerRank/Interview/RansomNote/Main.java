package HackerRank.Interview.RansomNote;

public class Main {
    public static void main(String[] args) {
        String [] st1= {"give","me","one","grand","today","night"};
        String [] st2= {"give","one","grand","today","today","today","today"};
        int count=0;
        for (int i= 0; i<st2.length;i++){
            for (int j=0;j<st1.length;j++){
                if (st2[i].equals(st1[j])){
                    st1[j]="";
                    count++;
                }
            }
        }
        if (count == st2.length)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
