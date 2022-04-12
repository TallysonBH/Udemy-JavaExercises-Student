package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();
		
		for(int j = 1 ; j <= N ; j++) {
			
			System.out.println("Product #" + j + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				Product prd = new ImportedProduct(name, price, customsFee);
				list.add(prd);
			}
			else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				Product prd = new UsedProduct(name, price, manufactureDate);
				list.add(prd);
			}
			else {
				Product prd = new Product(name, price);
				list.add(prd);
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product prd : list) {
			System.out.println(prd.priceTag());
		}
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
