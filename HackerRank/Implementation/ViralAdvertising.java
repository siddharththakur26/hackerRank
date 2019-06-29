package HackerRank.Implementation;

public class ViralAdvertising {
    public static void main(String[] args) {
        int n =3;
        int day = 1;
        int shared = 5;
        int like = shared/2;
        int cumm = 0;
        while(day <= n){
            like = shared/2;
            //System.out.println(like);
            shared = like * 3;
            //System.out.println(shared);
            cumm = cumm + like;
            day++;
        }
        System.out.println(cumm);

    }
}
