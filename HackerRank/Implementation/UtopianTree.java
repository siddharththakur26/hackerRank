package HackerRank.Implementation;

public class UtopianTree {
    public static void main(String[] args) {
        int n = 4;
        int height =0;
        for (int i=0;i<=n;i++){
            if (i == 0 )
                height = 1;
            else if (i%2 != 0 )
                height = height*2;
            else
                height = height + 1;
        }
        System.out.println(height);
    }
}
