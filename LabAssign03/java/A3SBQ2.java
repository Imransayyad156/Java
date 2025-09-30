package LabAssign03.java;
import java.util.*;
class InvalidNameException extends Exception {
 public InvalidNameException(String msg) {
     super(msg);
 }
}
public class A3SBQ2 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     try {
         System.out.print("Enter Doctor Name: ");
         String name = sc.nextLine();
         if (!name.matches("[a-zA-Z ]+")) {
             throw new InvalidNameException("Name is Invalid");
         }
         System.out.println("Valid Doctor Name: " + name);
     } catch (InvalidNameException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     sc.close();
 }
}
