package day11;

public class Day11Task2 {
	private int id;
	private String firstName;
    private String lastName;
    private int salary;
    
	public Day11Task2(int id, String firstName, String lastName, int salary) {
		
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
		
	}
	
	public int raiseSalary(int percent)
	{
		int raiseSalary=this.salary+(this.salary * percent)/100;
		return raiseSalary;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public int getsalary()
	{
		return this.salary;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setSalary(int inSalary)
	{
		this.salary=inSalary;
	}

	public int getAnnualSalary()
	{
		return this.salary * 12;
	}
	public static void main(String[] args) {
		Day11Task2 day11Task2 = new Day11Task2(1,"TestingFirstName","TestingLastName",50000);
		System.out.println("ID: " + day11Task2.getID());
		System.out.println("FirstName: " + day11Task2.getFirstName());
		System.out.println("LastName: " + day11Task2.getLastName());
		System.out.println("AnnualSalary: " + day11Task2.getAnnualSalary());
		System.out.println("Before Salary Raise: " + day11Task2.getsalary());
		int raiseSalary=day11Task2.raiseSalary(12);
		day11Task2.setSalary(raiseSalary);
		System.out.println("After Salary Raise: " + day11Task2.getsalary());

	}

}
