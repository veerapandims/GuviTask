package day9;

import java.util.Scanner;

public class Day9Task9 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		 try (Scanner scanner = new Scanner(System.in))
		 {
			// Get age input from the user
			 
	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();

	        // Check if the person is a senior citizen
	       
	        if (age >= 60) 
	        {
	            System.out.println("senior citizen.");
	        }
	       
	        else 
	        {
	            System.out.println("Not a senior citizen.");
	        }
		}
	    }
	}
