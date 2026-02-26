package Quarter3;

import java.util.Scanner;

public class Seatwork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many grades to put? ");
        int gradeAmt = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= gradeAmt; i++) {
            System.out.println("Enter grade " + i + ": ");
            int grade = sc.nextInt();
            sum += grade;
        }

        double avg = sum / gradeAmt;
        System.out.println("Average: " + avg);

        char letterGrade;
        if (avg >= 90) {
            letterGrade = 'A';
        } else if (avg >= 80) {
            letterGrade = 'B';
        } else if (avg >= 70) {
            letterGrade = 'C';
        } else if (avg >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("Grade in letter form: " + letterGrade);
        
        sc.close();
    }
}
