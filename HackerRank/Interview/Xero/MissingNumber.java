package HackerRank.Interview.Xero;

public class MissingNumber {
    public static void main(String[] args) {
        int [] ar={1,2,4,100};
        int [] artotal=new int[100];
        int [] ans=new int[artotal.length];
        int k=0,z=0;
        for (int i=1;i<=100;i++){
            artotal[z]=i;
            z++;
        }
        for (int i=0;i<ar.length;i++){
            for (int j=0;j<artotal.length;j++){
               if (ar[i] == artotal[j])
                   artotal[j] = 0;
            }
        }
        for (int i=0;i<artotal.length;i++){
            if (artotal[i] !=0){
                System.out.print(artotal[i]+" ");
            }
        }
        //System.out.println(Arrays.toString(ans));
    }
}
