package day15;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReaderException {

	public static void main(String[] args) {
		

	         {
		        Scanner inputScanner = new Scanner(System.in);

		        System.out.print("Enter the filename to read: ");
		        String filename = inputScanner.nextLine();

		        try {
		            File file = new File(filename);
		            Scanner fileScanner = new Scanner(file);

		            System.out.println("File contents:");
		            while (fileScanner.hasNextLine())
		            {
		                String line = fileScanner.nextLine();
		                System.out.println(line);
		            }

		            fileScanner.close();
		        }
		        catch (FileNotFoundException e)
		        {
		            System.out.println("Error: The file \"" + filename + "\" was not found.");
		        } finally
		        {
		            inputScanner.close();
		        }
		    }
		}

	}


