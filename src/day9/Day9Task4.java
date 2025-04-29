package day9;

import java.util.Scanner;

public class Day9Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			// Get two numbers from the user
			System.out.print("Enter the first number: ");
			int num1 = scanner.nextInt();

			System.out.print("Enter the second number: ");
			int num2 = scanner.nextInt();

			// Display original values
			System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

			// Swap using a temporary variable
			int temp = num1;
			num1 = num2;
			num2 = temp;

			// Display swapped values
			System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
		}
    }
}
