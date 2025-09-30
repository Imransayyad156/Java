package LabAssign01;
import java.io.*;
import java.util.Scanner;
public class A1SAQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print its multiplication table: ");
		  int num = sc.nextInt();
	System.out.println("Multiplication Table of " + num + ":");
	for (int i = 1; i <= 10; i++) {
	System.out.println(num + " x " + i + " = " + (num * i));
		    }
	}

}

