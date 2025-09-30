package Assignment1;
import java.util.Scanner;
public class CGPA {
public static double calculateCGPA(double[] marks) {
		  double sumOfGradePoints = 0;
		   int numberOfSubjects = marks.length;
		    for (double mark : marks) {
		          if (mark >= 90) {
		            sumOfGradePoints += 10;
		          } else if (mark >= 80) {
		                sumOfGradePoints += 9;
		            } else if (mark >= 70) {
		                sumOfGradePoints += 8;
		            } else if (mark >= 60) {
		                sumOfGradePoints += 7;
		            } else if (mark >= 50) {
		                sumOfGradePoints += 6;
		            } else {
		                sumOfGradePoints += 0; 
		            }
		        }

		        if (numberOfSubjects > 0) {
		            return sumOfGradePoints / numberOfSubjects;
		        } else {
		            return 0.0;
		        }
		    }
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number of subjects: ");
		        int numSubjects = sc.nextInt();
		        double[] subjectMarks = new double[numSubjects];
		        for (int i = 0; i < numSubjects; i++) {
		            System.out.print("Enter marks for subject " + (i + 1) + ": ");
		            subjectMarks[i] = sc.nextDouble();
		        }
		        double CGPA = calculateCGPA(subjectMarks);
		        System.out.printf("Your CGPA is:"+CGPA);
		    }
	}
