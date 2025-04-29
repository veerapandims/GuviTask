package day9;

import java.util.Scanner;

public class Day9Task10 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in))
		{
			// Get the number from the user
			System.out.print("Enter an integer: ");
			int number = scanner.nextInt();

			int count = 0;

			// Handle negative numbers by converting to positive
			number = Math.abs(number);

			// Special case: if number is 0, it has 1 digit
			if (number == 0)
			{
			    count = 1;
			} else 
			
			{
			    while (number > 0) 
			    {
			        number /= 10;
			        count++;
			    }
			}

			System.out.println("Number of digits: " + count);
		}
 
	}

}
