package LabAssign03.java;
	import java.io.*;
	import java.util.*;

	public class A3SAQ4{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Enter file name (with path if not in current folder): ");
	            String fileName = sc.nextLine();
	            File file = new File(fileName);
	            BufferedReader br = new BufferedReader(new FileReader(file));
	            int charCount = 0, wordCount = 0, lineCount = 0;
	            String line;
	            while ((line = br.readLine()) != null) {
	                lineCount++;
	                charCount += line.length();
	                String[] words = line.trim().split("\\s+");
	                if (!line.trim().isEmpty()) {
	                    wordCount += words.length;
	                }
	            }
	            br.close();
	            System.out.println("\nFile Statistics:");
	            System.out.println("Number of lines: " + lineCount);
	            System.out.println("Number of words: " + wordCount);
	            System.out.println("Number of characters: " + charCount);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found. Please check the file name and path.");
	        } catch (IOException e) {
	            System.out.println("Error reading the file.");
	        } finally {
	            sc.close();
	        }
	    }
	}
