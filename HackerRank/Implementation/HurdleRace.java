package HackerRank.Implementation;

public class HurdleRace {
    public static void main(String[] args) {
        int [] height = {1 ,6 ,3, 5, 2};
        int k = 4;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<height.length;i++){
            if (max < height[i]){
                max = height[i];
            }
        }
        System.out.println(max);
        if (max > k)
            System.out.println(Math.abs(max - k));
        else
            System.out.println(0);
    }

}
