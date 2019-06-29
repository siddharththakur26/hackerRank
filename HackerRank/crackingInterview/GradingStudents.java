package HackerRank.crackingInterview;

public class GradingStudents {
    public static void main(String[] args) {
        int [] grades ={73,67,38,33};
        for (int i=0; i<grades.length;i++){
            int multiplier = ((grades[i]/5)+1)*5;
            if (multiplier-grades[i] < 3 && grades[i]>=38){
                grades[i]=multiplier;
            }
        }
       // System.out.println(Arrays.toString(grades));
    }
}
