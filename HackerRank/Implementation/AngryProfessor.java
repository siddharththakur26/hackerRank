package HackerRank.Implementation;
/*Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO otherwise.

angryProfessor has the following parameter(s):

k: the threshold number of students
a: an array of integers representing arrival times
*/

public class AngryProfessor {
    public static void main(String[] args) {
        int k = 2; //thrshold
        int [] a = {0, -1, 2, 1}; // arrival rate
            int flagOnTime=0;
            for (int i=0;i<a.length;i++){
                if (a[i] <= 0)
                    flagOnTime++;
            }
        System.out.println(flagOnTime);
            if (flagOnTime >= k)
                System.out.println("NO");
            else
                System.out.println("YES");

    }
}
