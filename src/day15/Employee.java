package day15;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

public class Employee {

	public static void main(String[] args) {
		
		{
		        TreeMap<Integer, String> employeeMap = new TreeMap<>();

		        employeeMap.put(102, "Abi");
		        employeeMap.put(101, "Veerapandi");
		        employeeMap.put(105, "Vaishali");
		        employeeMap.put(103, "Begam");

		        ArrayList<String> employeeNames = new ArrayList<>(employeeMap.values());

		        Collections.sort(employeeNames);

		        System.out.println("Employee Names in Alphabetical Order:");
		        for (String name : employeeNames) {
		            System.out.println(name);
		        }
		    }
		}

	}


