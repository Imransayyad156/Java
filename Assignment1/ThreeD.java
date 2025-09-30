package Assignment1;

public class ThreeD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][][] numbers = {
		            { 
		                {1, 2, 3, 4},
		                {5, 6, 7, 8},
		                {9, 10, 11, 12}
		            },
		            { 
		                {13, 14, 15, 16},
		                {17, 18, 19, 20}, 
		                {21, 22, 23, 24} 
		            }
		        };
		        System.out.println("Elements of the 3D array:");
		        for (int i = 0; i < numbers.length; i++) {
		            System.out.println("\nTable " + i + ":");
		            for (int j = 0; j < numbers[i].length; j++) {
		                for (int k = 0; k < numbers[i][j].length; k++) { 
		                    System.out.print("numbers[" + i + "][" + j + "][" + k + "] = " + numbers[i][j][k] + "\t");
		                }
		                System.out.println();
		            }
		        }
		        System.out.println("\nSpecific element: numbers[1][0][2] = " + numbers[1][0][2]);
		    }
	}
