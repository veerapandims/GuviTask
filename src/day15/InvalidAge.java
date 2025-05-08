package day15;

import java.util.Scanner;

public class InvalidAge {

	public static void main(String[] args) {


		class InvalidAge extends Exception
		{
		    public InvalidAge(String message)
		    {
		        super(message);
		    }
		}

		class InvalidAge {
		    public static void InvalidAge(int age) throws InvalidAge
		    {
		        if (age < 18) {
		            throw new InvalidAge("Invalid Age: Age must be 18 or older.");
		        } else {
		            System.out.println("Access granted. You are eligible.");
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        try {
		            System.out.print("Enter your age: ");
		            int age = scanner.nextInt();

		            validateAge(age);
		        } catch (InvalidAge1 e) {
		            System.out.println("Error: " + e.getMessage());
		        } catch (Exception e) {
		            System.out.println("Error: Invalid input. Please enter a valid number.");
		        } finally {
		            scanner.close();
		        }
		    }

			private static void validateAge(int age) {
				// TODO Auto-generated method stub
				
			}

			private String getMessage() {
				return null;
			}
		}

	}

}
