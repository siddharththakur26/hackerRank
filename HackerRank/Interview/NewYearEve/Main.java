package HackerRank.Interview.NewYearEve;

public class Main {
    public static void main(String[] args) {
        int [] ar={1,2,3,4,5};
        int [] arAfterBribe={4,1,5,2,3};

      //  checkChaoitic(ar,arAfterBribe);
       checkChaoiticm1(arAfterBribe);
    }
    static void checkChaoiticm1(int arAfterBribe[]){
        int swap=0;
        for (int i=0;i<arAfterBribe.length;i++){
          if (arAfterBribe[i]-1-i > 2)
          { swap= arAfterBribe[i]-1-i;
            System.out.println(swap);
            System.out.println("Too Chaotic");
          }
        }


    }
    public static String checkChaoitic(int ar[], int arafterBribe[]){
        int index=0;
        int diff;
        for (int i=0; i<ar.length;i++){
            if (ar[i]!=arafterBribe[i]){
                for (int j=i;j<ar.length;j++){
                    if (ar[j]==arafterBribe[i])
                        index=j;
                }
            }
            diff=index-i;
            if (diff > 2 ) {
                System.out.println(diff);
                return "Too Chaoitic";
            }

        }
        return null;
    }
}
