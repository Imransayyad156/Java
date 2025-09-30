package LabAssign03.java;

public class TestThrow {
	public static void validate(int age)  
	 {   
	          if(age<18)  
	  {     
	             throw new ArithmeticException("Person is not eligible to vote");     
	          }   
	          else  
	  {   
	              System.out.println("Person is eligible to vote!!");   
	          }   
	     }     
	     public static void main(String args[]) 
	 {     
	          TestThrow.validate(19);   
	         System.out.println("rest of the code...");   
}
}
