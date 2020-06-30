package a1;
import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numStudents = scanner.nextInt();
		String[] firstName = new String[numStudents];
		String[] lastName = new String[numStudents];
		double[] assignGrade = new double[numStudents];
		double[] partGrade = new double[numStudents];
		double[] midterm = new double[numStudents];
		double[] finalExam = new double[numStudents];
		double[] finalGrade = new double[numStudents];
		String[] letterGrade = new String[numStudents];
		for (int i=0; i<numStudents; i++) {
			firstName[i] = scanner.next();
			lastName[i] = scanner.next();
			assignGrade[i] = scanner.nextDouble();
			partGrade[i] = scanner.nextDouble();
			midterm[i] = scanner.nextDouble();
			finalExam[i] = scanner.nextDouble();
			finalGrade[i] = (assignGrade[i] * .4) + (partGrade[i] * .15) + (midterm[i] * .20) + (finalExam[i] * .25);
		}
		for (int i=0; i<numStudents; i++) {
			if (finalGrade[i] >= 94) {
				letterGrade[i] = "A";
			} if (finalGrade[i] < 94 && finalGrade[i] >= 90) {
				letterGrade[i] = "A-";
			} if (finalGrade[i] < 90 && finalGrade[i] >= 86) {
				letterGrade[i] = "B+";
			} if (finalGrade[i] < 86 && finalGrade[i] >= 83) {
				letterGrade[i] = "B";
			} if (finalGrade[i] < 83 && finalGrade[i] >= 80) {
				letterGrade[i] = "B-";
			} if (finalGrade[i] < 80 && finalGrade[i] >= 76) {
				letterGrade[i] = "C+";
			} if (finalGrade[i] < 76 && finalGrade[i] >= 73) {
				letterGrade[i] = "C";
			} if (finalGrade[i] < 73 && finalGrade[i] >= 70) {
				letterGrade[i] = "C-";
			} if (finalGrade[i] < 70 && finalGrade[i] >= 65) {
				letterGrade[i] = "D+";
			} if (finalGrade[i] < 65 && finalGrade[i] >= 60) {
				letterGrade[i] = "D";
			} if (finalGrade[i] < 60) {
				letterGrade[i] = "F";
			}
		}
		for (int i=0; i<numStudents; i++) {
			System.out.println(firstName[i].charAt(0) + ". " + lastName[i] + " " + letterGrade[i]);
		}
	}
	
	// Feel free to define addition methods here.
	// Be sure to declare them as "public static"
	
}
