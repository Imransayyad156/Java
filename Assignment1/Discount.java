package Assignment1;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int p;
	        float dis;
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter purchase amount ");
	        p=sc.nextInt();
	        if(p<=5000)
	        {
	            dis=0;
	        }
	        else if(p>5000 && p<=10000)
	        {
	            dis=(p-5000)*(10/100.0f);
	        }
	        else if(p>10000 && p<=20000)
	        {
	            dis=(p-10000)*(20/100.0f);
	        }
	        else if(p>20000 && p<=30000)
	        {
	            dis=(p-20000)*(30/100.0f);
	        }
	        else
	        {
	            dis=(p-30000)*(40/100.0f);
	        }

	        System.out.println("Discount Amount = " + dis);
	        System.out.print("Net Bill Amount = " + (p-dis));
	}

}
