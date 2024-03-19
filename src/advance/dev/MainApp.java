package advance.dev;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainApp {
	private static final int NUM_STUDENTS = 10;
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] students = new Student[NUM_STUDENTS];
		input(students);
		print(students);
		sortStudentsByAverageScore(students);
		System.out.println("\nDanh sách sinh viên sau khi sắp xếp theo điểm trung bình:");
		print(students);
	}

	public static void input(Student[] students) {
		System.out.println("Nhập thông tin cho " + NUM_STUDENTS + " sinh viên:");
		for (int i = 0; i < NUM_STUDENTS; i++) {
			System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
			System.out.print("Tên: ");
			String name = scanner.nextLine();
			System.out.print("Tuổi: ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Địa chỉ: ");
			String address = scanner.nextLine();
			System.out.print("Số điện thoại: ");
			String phoneNumber = scanner.nextLine();
			System.out.print("Điểm trung bình: ");
			double averageScore = scanner.nextDouble();
			scanner.nextLine();

			students[i] = new Student(name, age, address, phoneNumber, averageScore);
		}
	}

	public static void print(Student[] students) {
		System.out.println("\nDanh sách sinh viên:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Sinh viên thứ " + (i + 1) + ": " + students[i]);
		}
	}

	public static void sortStudentsByAverageScore(Student[] students) {
		Arrays.sort(students, Comparator.comparingDouble(Student::getAverageScore));
	}
}
