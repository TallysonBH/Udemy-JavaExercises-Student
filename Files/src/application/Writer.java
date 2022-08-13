package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String[] lines = new String[] {"teste1", "Teste2", "Teste3"};
		
		
		
		String path = "C:\\temp\\CSV.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
				bw.write("8888");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
