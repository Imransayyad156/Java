package LabAssign03.java;
import java.util.*;
public class A3SAQ2 {
	    public static void main(String[] args) {
	        HashMap<String, Double> employeeTable = new HashMap<>();
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of employees: ");
	        int n = sc.nextInt();
	        sc.nextLine(); 
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Employee name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter Salary: ");
	            double salary = sc.nextDouble();
	            sc.nextLine(); 
	            employeeTable.put(name, salary);
	        }
	        System.out.println("\nEmployee Details:");
	        for (Map.Entry<String, Double> entry : employeeTable.entrySet()) {
	            System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
	        }
	        System.out.print("\nEnter Employee name to search: ");
	        String searchName = sc.nextLine();
	        if (employeeTable.containsKey(searchName)) {
	            System.out.println("Salary of " + searchName + " = " + employeeTable.get(searchName));
	        } else {
	            System.out.println(searchName + " not found in the records.");
	        }
	        sc.close();
	    }
	}
