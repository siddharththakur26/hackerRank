package HackerRank.crackingInterview;

public class Kangaroo {
    public static void main(String[] args) {
        int x1=0;
        int v1=3;
        int x2=4;
        int v2=2;
        int k1=x1+v1;
        int k2 = x2+v2;
        float j1=0,j2=0;
        while(k1 != k2){
            k1=k1+v1;
            k2=k2+v2;
        }
        System.out.println(k1+" "+k2);
        if ((k1-x1)%v1 == 0  && (k2-x2)%v2==0)
        {
            j1=(k1-x1)/v1;
            j2=(k2-x2)/v2;

        }

        System.out.println(j1+" "+j2);
        if (k1==k2 && k1>0 && k2>0 && j1==j2 && j1>0 && j2>0) {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
