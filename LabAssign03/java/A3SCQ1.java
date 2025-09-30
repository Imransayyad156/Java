package LabAssign03.java;
	import java.io.*;
	import java.util.*;
	public class A3SCQ1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> numbers = new ArrayList<>();
	        int choice;
	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Load (Generate Random Numbers)");
	            System.out.println("2. Save (Save Numbers to File)");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    numbers.clear();
	                    Random rand = new Random();
	                    System.out.println("Generated Numbers:");
	                    for (int i = 0; i < 10; i++) {
	                        int num = rand.nextInt(90) + 10; // 2-digit number (10–99)
	                        numbers.add(num);
	                        System.out.print(num + " ");
	                    }
	                    System.out.println();
	                    break;
	                case 2:
	                    if (numbers.isEmpty()) {
	                        System.out.println("No numbers to save! Please load first.");
	                    } else {
	                        try {
	                            FileWriter fw = new FileWriter("number.txt");
	                            for (int num : numbers) {
	                                fw.write(num + "\n");
	                            }
	                            fw.close();
	                            System.out.println("Numbers saved to number.txt successfully!");
	                        } catch (IOException e) {
	                            System.out.println("Error: " + e.getMessage());
	                        }
	                    }
	                    break;
	                case 3:
	                    System.out.println("Exiting program. Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }
	        } while (choice != 3);
	        sc.close();
	    }
	}
