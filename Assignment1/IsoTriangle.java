package Assignment1;
import java.util.Scanner;
public class IsoTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Area Of Isosceles Triangle");
	        System.out.println("Enter base and height ");
	        int b = sc.nextInt();
	        int h = sc.nextInt();
	        float a = b*h;
	        System.out.println("Area of Isoscales Traingle:");
	        System.out.println(0.5*a);
	}

}
