import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> grades = new ArrayList<>();

		System.out.println("Welcome to Student Grade Tracker!");

		// Input grades
		System.out.print("Enter the number of students: ");
		int numStudents = scanner.nextInt();

		for (int i = 0; i < numStudents; i++) {
			System.out.print("Enter grade for student " + (i + 1) + ": ");
			int grade = scanner.nextInt();
			grades.add(grade);
		}

		// Compute average, highest, and lowest
		if (!grades.isEmpty()) {
			int sum = 0;
			int highest = grades.get(0);
			int lowest = grades.get(0);

			for (int grade : grades) {
				sum += grade;
				if (grade > highest) {
					highest = grade;
				}
				if (grade < lowest) {
					lowest = grade;
				}
			}

			double average = (double) sum / grades.size();

			System.out.println("\n--- Grade Report ---");
			System.out.println("Average Grade: " + average);
			System.out.println("Highest Grade: " + highest);
			System.out.println("Lowest Grade: " + lowest);
		} else {
			System.out.println("No grades entered.");
		}

		scanner.close();

	}

}
