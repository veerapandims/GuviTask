package day11;

public class Day11Task2 {

	public static void main(String[] args) 
	{
		 private double radius;

		    public void Circle() {
		        this.radius = 0.0;
		    }

		    public void Circle(double radius, double unused) {
		        this.radius = radius;
		    }

		    // Method to calculate circumference
		    public double calculateCircumference() {
		        return 2 * Math.PI * radius;
		    }

		    // Getter for radius (optional)
		    public double getRadius() {
		        return radius;
		    }
		}

		public class circle {
		    public static void main(String[] args) {
		        Circle circle1 = new Circle();               // Using no-argument constructor
		        Circle circle2 = new Circle(5.0, 0);         // Using two-argument constructor

		        System.out.println("Circumference of circle1 (radius = " + circle1.getRadius() + "): " + circle1.calculateCircumference());
		        System.out.println("Circumference of circle2 (radius = " + circle2.getRadius() + "): " + circle2.calculateCircumference());
		    
	}

}
