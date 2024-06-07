package round2.org;

import java.util.Scanner;

public class SumOf2Arrays {
	
	
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the size of the matrix:");
		        int n = scanner.nextInt();
		        
		        int[][] matrix = new int[n][n];
		        
		        System.out.println("Enter the elements of the matrix:");
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                matrix[i][j] = scanner.nextInt();
		            }
		        }
		        
		        int result = diagonalSum(matrix);
		        System.out.println("Output: " + result);
		    }
		    
		    public static int diagonalSum(int[][] matrix) {
		        int n = matrix.length;
		        int topSum = 0;
		        int bottomSum = 0;
		        
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                if (i + j < n - 1) {
		                    topSum += matrix[i][j];
		                } else if (i + j > n - 1) {
		                    bottomSum += matrix[i][j];
		                }
		            }
		           
		        }
		        return Math.max(topSum, bottomSum);
		       
		    }

}
