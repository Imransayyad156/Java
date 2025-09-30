package Assignment1;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] numbers = {
		            {10, 20, 30},
		            {40, 50, 60},
		            {70, 80, 90}
		        };
		        System.out.println("Elements of the 2D array:");
		        for (int i = 0; i < numbers.length; i++) {
		            for (int j = 0; j < numbers[i].length; j++) {
		                System.out.print(numbers[i][j] + " ");
		            }
		            System.out.println();
		        }
		        System.out.println("\nAccessing element at [1][1]: " + numbers[1][1]);
		        numbers[1][1] = 55;
		        System.out.println("Modified element at [1][1]: " + numbers[1][1]);
		    }
	}
