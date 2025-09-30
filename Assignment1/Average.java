package Assignment1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		 int count = sc.nextInt();
		        if (count <= 0) {
		            System.out.println("The number of elements must be greater than zero.");
		            sc.close();
		            return;
		        }
		        double sum = 0;
		        for (int i = 0; i < count; i++) {
		            System.out.print("Enter number " + (i + 1) + ": ");
		            sum += sc.nextDouble();
		        }
		        double average = sum / count;
		        System.out.printf("The average of the numbers is: %.2f%n", average);
		        sc.close();
	}

}
