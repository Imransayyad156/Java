package Assignment1;

public class Constructor2 {
	public Constructor2() {
		System.out.println("I am in constructor");
	}
	//parameterize constructor
	public Constructor2(int a) {
		System.out.println("Value of a"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2 x=new Constructor2();
		Constructor2 a=new Constructor2(56);
	}

}
