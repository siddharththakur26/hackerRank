package HackerRank.crackingInterview;

public class AppleandOranges {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2,2,1};
        int[] oranges = {5,-6};
        int cnta=0;
        int cnto=0;
        for (int i=0;i<apples.length;i++){
            apples[i]= a + apples[i];
            if (apples[i] >=s && apples[i]<=t){
                cnta++;
            }
        }
        for (int i=0;i<oranges.length;i++){
            oranges[i]= b + oranges[i];

            if (oranges[i] >=s && oranges[i]<=t){
                cnto++;
            }
        }
        //System.out.println(Arrays.toString(apples));
        //System.out.println(Arrays.toString(oranges));
        System.out.println(cnta+"\n"+cnto);

    }
}
