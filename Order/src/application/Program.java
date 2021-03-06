package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.Orderitem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.next());
		
		
		Client cli = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, cli);
		
		
		
		System.out.print("How many items to this order? ");
		int N = sc.nextInt();
				
		
		
		for(int i = 0 ; i< N ; i++) {
			System.out.println("Enter #"+ (i + 1) +" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, price);
			
			Orderitem orderItem = new Orderitem(quantity, price, product);
			
			order.addItem(orderItem);
			
		}
		
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		
		
		sc.close();
		
	}

}
