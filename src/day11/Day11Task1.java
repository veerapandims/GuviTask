package day11;

public class Day11Task1
{
	private String name;
    private int age;

    public Day11Task1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

	public static void main(String[] args)
	{
		
		        Day11Task1 person1 = new Day11Task1("Testing", 25);

		        System.out.println("Name: " + person1.getName());
		        System.out.println("Age: " + person1.getAge());
		    
		
	}
}