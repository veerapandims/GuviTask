package day11;

public class Day11Task3 {

	
		private int radius;
        
	    public Day11Task3() {
	        
	    }

	    public Day11Task3(int radius, int unused) {
	        this.radius = radius;
	    }

	    public double calculateCircumference() {
	        return 2 * Math.PI * this.radius;
	    }

	    
	

	
	    public static void main (String[] args) {
	    	Day11Task3 circle1 = new Day11Task3();              
	    	Day11Task3 circle2 = new Day11Task3(4,0);         

	        System.out.println("Circumference of circle :" + circle2.calculateCircumference());
	        
	    
	    }

}
