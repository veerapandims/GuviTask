package day9;

import java.util.Scanner;

public class Day9Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			// Ask user for input
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			boolean isPrime = true;

			// 0 and 1 are not prime numbers
			if (number <= 1) {
			    isPrime = false;
			} else {
			    // Check for divisibility from 2 to number - 1
			    for (int i = 2; i < number; i++) {
			        if (number % i == 0) {
			            isPrime = false;
			            break;
			        }
			    }
			}

			// Output the result
			if (isPrime) 
			{
			    System.out.println(number + " is a prime number.");
			} 
			
			else 
			{
			    System.out.println(number + " is not a prime number.");
			}
		}
    }
}
