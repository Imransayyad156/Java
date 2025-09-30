package Assignment1;
import java.util.Scanner;
public class Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the number of units consumed: ");
		 int units = sc.nextInt();
		 double billAmount = 0;
	  if (units <= 100) {
		  billAmount = units * 1.50;
		 } else if (units <= 300) {
		   billAmount = (100 * 1.50) + ((units - 100) * 2.50);
		  } else {
		   billAmount = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 4.00); 
		    }
		   System.out.println("Total electricity bill: Rs. " + String.format("%.2f", billAmount));
	}

}
