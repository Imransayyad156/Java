package LabAssign03.java;
	import java.util.*;
	class NumberIsZeroException extends Exception {
	    public NumberIsZeroException(String message) {
	        super(message);
	    }
	}
	public class A3SAQ3{
	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Enter a number: ");
	            int number = sc.nextInt();
	            if (number == 0) {
	                throw new NumberIsZeroException("Number is 0");
	            }
	            if (isPrime(number)) {
	                System.out.println(number + " is a Prime Number.");
	            } else {
	                System.out.println(number + " is NOT a Prime Number.");
	            }
	        } catch (NumberIsZeroException e) {
	            System.out.println("Exception: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Invalid input. Please enter a valid number.");
	        } finally {
	            sc.close();
	        }
	    }
	}
