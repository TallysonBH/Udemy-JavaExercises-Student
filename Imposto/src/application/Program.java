package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = sc.nextInt();
		
		for(int i = 1 ; i <= N ; i++) {
			System.out.println("Tax payer #" + i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char chr = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double rendaAnual = sc.nextDouble();
			if(chr == 'i') {
				System.out.print("Health expenditures: ");
				Double gastosSaude = sc.nextDouble();
				
				Contribuinte ctbt = new PessoaFisica(name, rendaAnual, gastosSaude);
				list.add(ctbt);
			}
			else {
				System.out.print("Number of employees: ");
				Integer numeroFuncionarios = sc.nextInt();
				
				Contribuinte ctbt = new PessoaJuridica(name, rendaAnual, numeroFuncionarios);
				list.add(ctbt);
				}
				
			}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		Double totalTaxes = 0.0;
		
		for(Contribuinte ctbt : list) {
			System.out.println(ctbt.getName() + " : $ " + String.format("%.2f", ctbt.imposto()));
		
			totalTaxes += ctbt.imposto();
		}
		
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		

		
		sc.close();
		
		
	}

}
