package day10;

import java.util.Scanner;

public class Day10Task6
{

	public static void main(String[] args)
	{
		
		 Scanner scanner = new Scanner(System.in);

	        int month = scanner.nextInt();
	        float rentPerDay = scanner.nextFloat();
	        int daysStayed = scanner.nextInt();

	        switch (month) 
	        {
	            case 4: case 5: case 6:
	            case 11: case 12:
	                rentPerDay += rentPerDay * 0.20f;
	                break;
	        }

	        float totalTariff = rentPerDay * daysStayed;

	        // Always print with 2 decimal places
	        System.out.printf("%.2f\n", totalTariff);

	        scanner.close();

	}

}
