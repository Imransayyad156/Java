package Assignment1;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[][] = { { 1, 2 }, { 3, 4 } };
	    int B[][] = { { 1, 1 }, { 1, 1 } };
			        int rows = A.length;
			        int cols = A[0].length;
			        int sum[][] = new int[rows][cols];
			        for (int i = 0; i < rows; i++) {
			            for (int j = 0; j < cols; j++) {
			                sum[i][j] = A[i][j] + B[i][j];
			            }
			        }		  
			        System.out.println("Resultant Matrix:");
			        for (int i = 0; i < rows; i++) {
			            for (int j = 0; j < cols; j++) {
			                System.out.print(sum[i][j] + " ");
			            }
			            System.out.println();
			        }
	}

}
