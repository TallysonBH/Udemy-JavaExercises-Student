package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		System.out.println("Informe o tamanho da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0 ; i<mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		
		System.out.println("Main Diagonal: ");
		
		int count;
		count = 0;
		
		for (int i = 0 ; i<mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				
				if(i==j) {
					System.out.print(mat[i][j] + " ");
				}
				
				if(mat[i][j] < 0) {
					count ++;
				}
				
			}
		}
		
		System.out.println();
		System.out.println("Negative numbers = " + count);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
