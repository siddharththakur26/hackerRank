package HackerRank.Implementation;
/*
 Complete the jumpingOnClouds function in the editor below. It should return an integer representing the energy level remaining after the game.

jumpingOnClouds has the following parameter(s):

c: an array of integers representing cloud types
k: an integer representing the length of one jump
 */
public class JumpingCloudsR {
    public static void main(String[] args) {
        int [] c = {1, 1, 1, 0, 1 ,1, 0, 0, 0, 0};
        int k = 3;
        int n = c.length;
        int e = 100;
        int jump=0;

        while (jump < n){
            int index = (jump+k)%n;
            if (c[index] == 1)
                e = e-1-2;
            else
                e = e-1;
            jump = jump + k;
        }
        System.out.println(e);

    }

}
