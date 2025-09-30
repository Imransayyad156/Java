package Assignment1;
import java.util.Scanner;
public class Batting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the total runs scored: ");
		int totalRuns = sc.nextInt();
		System.out.print("Enter the number of times dismissed: ");
		int dismissals = sc.nextInt();
		 double batAvg = (double) totalRuns / dismissals; 
		 System.out.printf("The batting average is:"+batAvg);
	}

}
