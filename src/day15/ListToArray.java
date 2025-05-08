package day15;
import java.util.ArrayList;
import java.util.List;
public class ListToArray {

	public static void main(String[] args) {
		
		    
		        List<String> list = new ArrayList<>();
		        list.add("Apple");
		        list.add("Cherry");
		        list.add("Banana");

		        String[] array = list.toArray(new String[0]);

		        System.out.println("Array elements:");
		        for (String item : array) {
		            System.out.println(item);
		        }
		    }
		
}