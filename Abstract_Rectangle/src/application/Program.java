package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of shapes:");
		int N = sc.nextInt();
		
		
		for(int i=1 ; i<=N ; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				
				Shape shp = new entities.Rectangle(color, width, height);
				list.add(shp);			
			}
			else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				
				Shape shp = new Circle(color, radius);
				list.add(shp);
			}
			
		}
		
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for(Shape shp : list) {
			System.out.println(String.format("%.2f", shp.area()));
		}
		
		
		
		
		
		
		sc.close();
	
	}

}
