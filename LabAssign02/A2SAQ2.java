package LabAssign02;
import java.util.Scanner;
import Series.Fibonacci;
import Series.Cube;
import Series.Square;
public class A2SAQ2 {
	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	         System.out.print("Enter the number of terms (n): ");
	         int n = scanner.nextInt();
	        Fibonacci fib = new Fibonacci();
	        Cube cube = new Cube();
	        Square square = new Square();

	        fib.printFibonacci(n);
	        cube.printCubes(n);
	        square.printSquares(n);
	        
	        scanner.close();

	    }
	}

