package LabAssign03.java;
	import java.util.Scanner;
	class InvalidDateException extends Exception {
	    public InvalidDateException(String message) {
	        super(message);
	    }
	}
	class MyDate {
	    private int day, month, year;
	    public void acceptDate(int d, int m, int y) throws InvalidDateException {
	        if (!isValidDate(d, m, y)) {
	            throw new InvalidDateException("Invalid Date: " + d + "/" + m + "/" + y);
	        }
	        this.day = d;
	        this.month = m;
	        this.year = y;
	    }
	    public void displayDate() {
	        System.out.println("Date: " + day + "/" + month + "/" + year);
	    }
	    private boolean isValidDate(int d, int m, int y) {
	        if (y < 1 || m < 1 || m > 12 || d < 1) return false;

	        int[] daysInMonth = { 31, (isLeapYear(y) ? 29 : 28), 31, 30, 31, 30,
	                              31, 31, 30, 31, 30, 31 };
	        return d <= daysInMonth[m - 1];
	    }
	    private boolean isLeapYear(int y) {
	        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
	    }
	}
	public class A3SCQ2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        MyDate date = new MyDate();
	        try {
	            System.out.print("Enter day: ");
	            int d = sc.nextInt();
	            System.out.print("Enter month: ");
	            int m = sc.nextInt();
	            System.out.print("Enter year: ");
	            int y = sc.nextInt();
	            date.acceptDate(d, m, y);
	            date.displayDate();
	        } catch (InvalidDateException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        sc.close();
	    }
	}
