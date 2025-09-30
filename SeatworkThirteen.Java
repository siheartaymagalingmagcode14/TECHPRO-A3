import java.util.Scanner;
public class SeatworkThirteen {
	public static String calculateGrade(double percentage) {
			if (percentage >= 90) return "A";
			else if (percentage >= 80) return "B";
			else if (percentage >= 70) return "C";
			else if (percentage >= 60) return "D";
			else return "F";
	}
		
		public static String calculateGrade(int score, int maxScore) {
			double percentage = (double) score / maxScore * 100;
			return calculateGrade(percentage);
		}
		
		public static String calculateGrade(double[] subjectScores) {
			double total = 0;
			for (double score : subjectScores) {
				total += score;
			}
			double average = total / subjectScores.length;
			return calculateGrade(average);
		}
		
		
	public static void main(String[] args) {
		
		
		
	}
}
