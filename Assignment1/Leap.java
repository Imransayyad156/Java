package Assignment1;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int year=2025;
	     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	    	 System.out.println("Entered year is Leap year");
	     }else {
	    	 System.out.println("Entered year is not a Leap year");
	     }
	}
}
