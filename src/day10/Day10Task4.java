package day10;

import java.util.Scanner;

public class Day10Task4 {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the pattern (odd number recommended): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= n; j++)
            {
                if (j == i || j == (n - i + 1))
                {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

        scanner.close();
	}

}
