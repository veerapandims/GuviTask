package day9;

import java.util.Scanner;

public class Day9Task6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			   
			    int number = scanner.nextInt();

			    long factorial = 1;

			    // Factorial is not defined for negative numbers
			   
			    if (number < 0) 
			   
			    {
			        System.out.println("Factorial is not defined for negative numbers.");
			    }
			    
			    else
			   
			    {
			        for (int i = 1; i <= number; i++) 
			        {
			            factorial *= i;
			        }

			        System.out.println("Factorial of " + number + " is: " + factorial);
			    }
		}

	        // Get the number from the user

	}

}
