package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rent[] vect = new Rent[10];
		
		for(int i = 1 ; i < n + 1 ; i++) {
			
			System.out.println("Rent #" + i + " :" );
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			
			vect[room] = new Rent(name , email , room);
			
			
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0 ; i < 10 ; i++) {
			
			if(vect[i] != null) {
				System.out.println(i + vect[i].toString());
			}
			
		}
		
		
		
		
		
		sc.close();
		
	}

}
