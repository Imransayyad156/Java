package LabAssign03.java;
import java.io.*;
import java.util.Scanner;
public class A3SBQ3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String fileName = "customers.dat";
	        try {
	            FileOutputStream fos = new FileOutputStream(fileName);
	            DataOutputStream dos = new DataOutputStream(fos);
	            System.out.print("Enter number of customers: ");
	            int n = sc.nextInt();
	            sc.nextLine();
	            for (int i = 1; i <= n; i++) {
	                System.out.println("\nEnter details of customer " + i + ":");
	                System.out.print("Customer ID: ");
	                int c_id = sc.nextInt();
	                sc.nextLine();
	                System.out.print("Customer Name: ");
	                String cname = sc.nextLine();
	                System.out.print("Address: ");
	                String address = sc.nextLine();
	                System.out.print("Mobile No: ");
	                String mobile_no = sc.nextLine();
	                dos.writeInt(c_id);
	                dos.writeUTF(cname);
	                dos.writeUTF(address);
	                dos.writeUTF(mobile_no);
	            }
	            dos.close();
	            fos.close();
	            FileInputStream fis = new FileInputStream(fileName);
	            DataInputStream dis = new DataInputStream(fis);
	            System.out.println("\nCustomer Details from File:");
	            try {
	                while (true) {
	                    int c_id = dis.readInt();
	                    String cname = dis.readUTF();
	                    String address = dis.readUTF();
	                    String mobile_no = dis.readUTF();
	                    System.out.println("-----------------------------");
	                    System.out.println("Customer ID   : " + c_id);
	                    System.out.println("Name          : " + cname);
	                    System.out.println("Address       : " + address);
	                    System.out.println("Mobile Number : " + mobile_no);
	                }
	            } catch (EOFException e) {
	            }
	            dis.close();
	            fis.close();
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        sc.close();
	    }
	}

