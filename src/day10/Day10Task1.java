package day10;

import java.util.Scanner;

public class Day10Task1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        input = input.toLowerCase();
        boolean isPalindrome = true;

        int length = input.length();

        for (int i = 0; i < length / 10; i++)
        {
            if (input.charAt(i) != input.charAt(length - 1 - i)) 
            {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) 
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
	}

}
