package day11;

public class Day11Task1 {

	public static void main(String[] args)
	{
		class Person {
		    // Attributes
		    private String name;
		    private int age;

		    // Constructor
		    public Person(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }

		    // Getter for name
		    public String getName() {
		        return name;
		    }

		    // Getter for age
		    public int getAge() {
		        return age;
		    }

		    // Main method to test the class
		    public static void main(String[] args) {
		        // Create a Person object
		        Person person1 = new Person("Alice", 30);

		        // Display the attributes using getters
		        System.out.println("Name: " + person1.getName());
		        System.out.println("Age: " + person1.getAge());
		    }
		}
		
	   }
	}
