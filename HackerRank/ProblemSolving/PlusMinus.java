package HackerRank.ProblemSolving;

public class PlusMinus {
    public static void main(String[] args) {
        int [] arr = {1,1,0,-1,-1};
        double cntpos=0,cntneg=0,cntzeros=0;
        for (int i=0; i< arr.length;i++){
            if(arr[i]>0)
                cntpos++;
            else if(arr[i] < 0)
                cntneg++;
            else
                cntzeros++;

        }
        double len=arr.length;
        double posratio=(cntpos/len);
        double negratio=cntneg/len;
        double zeroratio=cntzeros/len;
        System.out.printf("%.6f",posratio);
        System.out.println();
        System.out.printf("%.6f",negratio);
        System.out.println();
        System.out.printf("%.6f",zeroratio);

    }
}
