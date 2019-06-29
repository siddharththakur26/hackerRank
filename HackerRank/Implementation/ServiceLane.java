package HackerRank.Implementation;

import java.util.Arrays;

public class ServiceLane {
    public static void main(String[] args) {
        int [][] cases = new int[5][5];//{{2,1,2,2,2},{3,4,4,4,3}};
        cases[0][0]= 2;
        cases[0][1]= 3;
        cases[1][0]= 1;
        cases[1][1]= 4;
        cases[2][0]= 2;
        cases[2][1]= 4;
        cases[3][0]= 2;
        cases[3][1]= 4;
        cases[4][0]= 2;
        cases[4][1]= 3;
        System.out.println(Arrays.toString(cases));

        int [] width = {1, 2, 2, 2, 1};
        int start=0;
        int end=0;
        int t = 5;
        int[] min = new int[t];

        int k=0;
        for (int i=0;i<t;i++ ){
            start = cases[i][0];
            end = cases[i][1];
            int [] result = Arrays.copyOfRange(width,start,end+1);
            //System.out.println(Arrays.toString(result));
            Arrays.sort(result);
            min[k] = result[0];
            k++;

        }
        System.out.println(Arrays.toString(min));

    }
}

/*
for (int i=0; i<cases[0].length;i++){
            for (int j=0; j<cases[1].length;j++){


            }
        }
        System.out.println(cases[1].length);
 */
