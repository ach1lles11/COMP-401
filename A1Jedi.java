package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numAssignments = scanner.nextInt();
		int[] totalPoints = new int[numAssignments];
		for (int i = 0; i < numAssignments; i++) {
			totalPoints[i] = scanner.nextInt();
		}
		double total = 0;
		for (int i = 0; i < numAssignments; i++) {
			total += totalPoints[i];
		}
		int totalPartPoints = scanner.nextInt();
		int numStudents = scanner.nextInt();
		String[] firstName = new String[numStudents];
		String[] lastName = new String[numStudents];
		double[] assignGrade = new double[numStudents];
		double[] partGrade = new double[numStudents];
		double[] midterm = new double[numStudents];
		double[] finalExam = new double[numStudents];
		double[] finalGrade = new double[numStudents];
		String[] letterGrade = new String[numStudents];
		double[] partPoints = new double[numAssignments];
		double[] totalAssPoints = new double[numStudents];
		int aCount = 0;
		int amCount = 0;
		int bpCount = 0;
		int bCount = 0;
		int bmCount = 0;
		int cpCount = 0;
		int cCount = 0;
		int cmCount = 0;
		int dpCount = 0;
		int dCount = 0;
		int fCount = 0;

		for (int i = 0; i < numStudents; i++) {
			firstName[i] = scanner.next();
			lastName[i] = scanner.next();
			partPoints[i] = scanner.nextDouble();
			partGrade[i] = 100 * (partPoints[i] / (totalPartPoints * 0.8));
			if (partGrade[i] > 100) {
				partGrade[i] = 100;
			}
			totalAssPoints[i] = 0;
			for (int j = 0; j < numAssignments; j++) {
				totalAssPoints[i] += scanner.nextDouble();
			}
			assignGrade[i] = totalAssPoints[i] * 100 / total;
			midterm[i] = scanner.nextDouble();
			finalExam[i] = scanner.nextDouble();
			finalGrade[i] = assignGrade[i] * .4 + partGrade[i] * .15 + midterm[i] * .20 + finalExam[i] * .25;
		}
		double midtermAverage = 0;
		double finalExamAverage = 0;
		for (int i = 0; i < numStudents; i++) {
			midtermAverage += midterm[i];
			finalExamAverage += finalExam[i];
		}
		midtermAverage = midtermAverage / numStudents;
		finalExamAverage = finalExamAverage / numStudents;
		double midtermSTD = 0;
		double finalSTD = 0;

		for (int i = 0; i < numStudents; i++) {

			midtermSTD += (midterm[i] - midtermAverage) * (midterm[i] - midtermAverage);
			finalSTD += (finalExam[i] - finalExamAverage) * (finalExam[i] - finalExamAverage);

		}
		midtermSTD = Math.sqrt(midtermSTD / numStudents);
		finalSTD = Math.sqrt(finalSTD / numStudents);

		double[] midtermNorm = new double[numStudents];
		double[] finalExamNorm = new double[numStudents];

		for (int i = 0; i < numStudents; i++) {
			midtermNorm[i] = (midterm[i] - midtermAverage) / midtermSTD;
			finalExamNorm[i] = (finalExam[i] - finalExamAverage) / finalSTD;
		}


		for (int i = 0; i < numStudents; i++) {
			if (finalGrade[i] >= 94) {
				letterGrade[i] = "A";
			}
			if (finalGrade[i] < 94 && finalGrade[i] >= 90) {
				letterGrade[i] = "A-";
			}
			if (finalGrade[i] < 90 && finalGrade[i] >= 86) {
				letterGrade[i] = "B+";
			}
			if (finalGrade[i] < 86 && finalGrade[i] >= 83) {
				letterGrade[i] = "B";
			}
			if (finalGrade[i] < 83 && finalGrade[i] >= 80) {
				letterGrade[i] = "B-";
			}
			if (finalGrade[i] < 80 && finalGrade[i] >= 76) {
				letterGrade[i] = "C+";
			}
			if (finalGrade[i] < 76 && finalGrade[i] >= 73) {
				letterGrade[i] = "C";
			}
			if (finalGrade[i] < 73 && finalGrade[i] >= 70) {
				letterGrade[i] = "C-";
			}
			if (finalGrade[i] < 70 && finalGrade[i] >= 65) {
				letterGrade[i] = "D+";
			}
			if (finalGrade[i] < 65 && finalGrade[i] >= 60) {
				letterGrade[i] = "D";
			}
			if (finalGrade[i] < 60) {
				letterGrade[i] = "F";
			}
		}
		for (int i = 0; i < numStudents; i++) {
			
			if (letterGrade[i] == "A") {
				aCount += 1;
			}
			if (letterGrade[i] == "A-") {
				amCount += 1;
			}
			if (letterGrade[i] == "B+") {
				bpCount += 1;
			}
			if (letterGrade[i] == "B") {
				bCount += 1;
			}
			if (letterGrade[i] == "B-") {
				bmCount += 1;
			}
			if (letterGrade[i] == "C+") {
				cpCount += 1;
			}
			if (letterGrade[i] == "C") {
				cCount += 1;
			}
			if (letterGrade[i] == "C-") {
				cmCount += 1;
			}
			if (letterGrade[i] == "D+") {
				dpCount += 1;
			}
			if (letterGrade[i] == "D") {
				dCount += 1;
			}
			if (letterGrade[i] == "F") {
				fCount += 1;
			}
			
		}
		System.out.println("A: " + aCount);
		System.out.println("A-: " + amCount);
		System.out.println("B+: " + bpCount);
		System.out.println("B: " + bCount);
		System.out.println("B-: " + bmCount);
		System.out.println("C+: " + cpCount);
		System.out.println("C: " + cCount);
		System.out.println("C-: " + cmCount);
		System.out.println("D+: " + dpCount);
		System.out.println("D: " + dCount);
		System.out.println("F: " + fCount);
		
		

	// Feel free to define addition methods here.
	// Be sure to declare them as "public static"
	}
}
