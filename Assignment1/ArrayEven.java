package Assignment1;
import java.util.Scanner;
public class ArrayEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the size of the array: ");
		 int size = sc.nextInt();
		 int[] numbers = new int[size];
		 System.out.println("Enter " + size + " elements of the array:");
		 for (int i = 0; i < size; i++) {
		 numbers[i] = sc.nextInt();
		        }
		 System.out.print("\nEven Numbers: ");
		for (int number : numbers) {
		 if (number % 2 == 0) {
		  System.out.print(number + " ");
		            }
		        }
		System.out.print("\nOdd Numbers: ");
		for (int number : numbers) {
		if (number % 2 != 0) {
		System.out.print(number + " ");
		            }
		        }
		        sc.close();
	}

}
