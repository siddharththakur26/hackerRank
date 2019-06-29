package HackerRank.HackerWorld.Inheritance;

import java.util.Scanner;

public class Main {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Main(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

     static class Student extends Main{
        private int[] testScores;

        Student(String firstName,String lastName, int idNumber, int[] testScores){
            super(firstName, lastName, idNumber);
            this.testScores=testScores;
        }
        public char calculate(){
            int sum=0;
            for (int i=0;i<testScores.length;i++){
                sum=sum+(testScores[i]);
            }
            int avg=sum/testScores.length;
            if (avg<40)
                return 'T';
            else if (avg>=40 && avg<55)
                return 'D';
            else if (avg>=55 && avg<70)
                return 'P';
            else if (avg>=70 && avg<80)
                return 'A';
            else if (avg>=80 && avg<90)
                return 'E';
            else
                return 'O';
        }

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String firstname=in.next();
        String lastname=in.next();
        int id=in.nextInt();
        int size=in.nextInt();
        int[] ar=new int[size];
        for (int i=0;i<size;i++) {
            ar[i] = in.nextInt();
        }
        Student stu=new Student(firstname,lastname,id,ar);
        stu.printPerson();
        System.out.println(stu.calculate());


    }



    }

