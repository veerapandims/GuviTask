package day10;

import java.util.Scanner;

public class Day10Task3 
{

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();

	        int num = 1; 

	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(num);
	                num++; 
	            }
	            System.out.println();
	        }

	        scanner.close();
	}

}
