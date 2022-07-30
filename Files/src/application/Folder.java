package application;

import java.io.File;
import java.util.Scanner;

public class Folder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Folder path: ");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File :: isDirectory);
		System.out.println("Folders:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File :: isFile);
		System.out.println("Files");
		for(File file : files) {
			System.out.println(file);
		}
		
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Folders:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		sc.close();
	}

}
