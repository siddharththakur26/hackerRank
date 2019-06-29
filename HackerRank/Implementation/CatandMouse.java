package HackerRank.Implementation;

public class CatandMouse {

    public static void main(String[] args) {
        int x=1;
        int y=3;
        int z=2;
        int distance_a_c = Math.abs(x - z);
        int distance_b_c = Math.abs(y - z);
        if (distance_a_c == distance_b_c){
            System.out.println("Mouse C");
        }
        else{
            if (distance_a_c > distance_b_c)
                System.out.println("Cat B");
            else{
                System.out.println("Cat A");
            }
        }
    }
}
