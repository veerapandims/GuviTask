package day15;

public class Array {

	public static void main(String[] args) {
		try {
            int[] numbers = {10, 20, 40, 50, 30};
            System.out.println("Accessing index 5 of array: " + numbers[5]); 
        }
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Error: Array Index Out OF Bounds Exception.");
        }

        try {
            String text = "Hello";
            System.out.println("Accessing character at index 10: " + text.charAt(10)); 
        } 
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Error: String Index Out Of Bound Exception.");
        }
	}

}
