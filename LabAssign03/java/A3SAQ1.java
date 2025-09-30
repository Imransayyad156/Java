package LabAssign03.java;
import java.util.*;
public class A3SAQ1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        TreeSet<Integer> numbers = new TreeSet<>();
	        System.out.print("Enter the number of integers: ");
	        int n = sc.nextInt();
	        System.out.println("Enter " + n + " integers: ");
	        for (int i = 0; i < n; i++) {
	            int num = sc.nextInt();
	            numbers.add(num);
	        }
	        System.out.println("Sorted numbers without duplicates: " + numbers);
	        System.out.print("Enter an element to search: ");
	        int searchElement = sc.nextInt();
	        if (numbers.contains(searchElement)) {
	            System.out.println(searchElement + " is present in the collection.");
	        } else {
	            System.out.println(searchElement + " is NOT present in the collection.");
	        }
	        sc.close();
	    }
	}
