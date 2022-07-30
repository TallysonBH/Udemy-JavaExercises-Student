package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] lines = new String[] {"teste1", "Teste2", "Teste3"};
		
		String path = "C:\\Users\\tally\\Documents\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
