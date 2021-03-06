package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.DadosFuncionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		List<DadosFuncionario> list = new ArrayList<>();
	
		
		System.out.print("Quantos funcionarios serao cadastrados? ");				
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			
			System.out.println();
			System.out.println("Funcionario #" + (i+1) + ": ");
			System.out.print("ID: ");
			Integer ID = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			
			DadosFuncionario funcionario = new DadosFuncionario(name, ID, salario);
						
			list.add(funcionario);
				
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Integer pos = position(list, id);
		
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			Double porcentagem = sc.nextDouble();
			list.get(pos).incrementarSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for(DadosFuncionario x : list) {
			System.out.println(x);
		}
		
		
		
		sc.close();
	}
	
	
	public static Integer position(List<DadosFuncionario> list, int id) {
		for(int i = 0 ; i < list.size() ; i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
		
}
