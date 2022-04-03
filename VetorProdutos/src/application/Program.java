package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0 ; i < vect.length  ; i++ ) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);			
		}
		
			
		for(int j = 0 ; j < vect.length ; j++) {
			System.out.println(vect[j].toString());
		}
		
		
		
		
		sc.close();
	}

}
