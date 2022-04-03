package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		int M , N;
		
		System.out.println("Informe a quantidade de Linhas da Matriz: ");
		M = sc.nextInt();
		System.out.println("Informe a quantidade de colunas da Matriz: ");
		N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for(int i = 0 ; i < M ; i++) {
			for(int j = 0 ; j < N ; j ++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.print("Informe um elemento contido na matriz: ");
		int element = sc.nextInt();
		
		
		for(int i = 0 ; i < M ; i++) {
			for(int j = 0 ; j < N ; j ++) {
				
				if(mat[i][j] == element) {
					
					System.out.println("Position: " + i + " , " + j);
								
				//Left
				
				if(j - 1 >=0) {
					
					System.out.println("Left: " + mat[i][j-1]);
				}
				
				// Right
				
				if(j + 1 <= N - 1) {
					
					System.out.println("Right: " + mat[i][j + 1]);
				}
				
				// up
				
				if(i - 1 >=0) {
					
					System.out.println("UP: " + mat[i - 1][j]);
				}
				
				// down
				
				if(i + 1 <= M - 1) {
					
					System.out.println("Down: " + mat[i +1][j]);
				}
				
			   }
			}
		}
		
		
		
		
		sc.close();
			
	}

}
