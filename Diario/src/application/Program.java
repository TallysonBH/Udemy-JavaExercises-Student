package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao seu diario! \nPara inicarmos precisamos saber alguns dados, vamos la?");
		System.out.println();
		
		System.out.println("1 - Vamos Nessa!\n2 - Melhor Pararmos por aqui.");
		System.out.println();
		System.out.print("O que vamos fazer (escolha acima): ");
		int escolha = sc.nextInt();
				
		
		if(escolha == 1) {
			System.out.println();
			sc.nextLine();
			System.out.print("Informe seu nome: ");
			String name = sc.nextLine();
			System.out.print("Informe sua idade: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.print("Informe o local do seu nascimento: ");
			String locale = sc.nextLine();
			
			Person person = new Person(name, age, locale);
			
			System.out.printf("Muito Bem "+ person.name + ", podemos Continuar. \n\nO que deseja saber?\n");
			
		
		}
		
		else {
			System.out.println("Fim do Programa, volte sempre!");
		}
		
		
		
		System.out.println();
		System.out.println("1 No que eu acredito?\r\n"
				+ "\r\n"
				+ "2 Qual a minha aspiracao?\r\n"
				+ "\r\n"
				+ "3 Qual o meu proposito?\r\n"
				+ "\r\n"
				+ "4 Como estou buscando meu proposito e aspiracao atraves dessa oportunidade?"
	        	+ "\r\n"
				+"Digeite 0 para Sair.");
				
			
		int Options = sc.nextInt();
			
		
		do {	
			switch(Options) {
			case 1:
				System.out.println("Eu acredito que independete de qualquer coisa, todos somos capazes.");
				break;
			case 2:
				System.out.println("Hoje aspiro crescimento pessoal e profissional.");
				break;
			case 3:
			System.out.println("Ser um bom pai, ser um excelente marido, um bom desenvolvedor.");
				break;
			case 4:
				System.out.println("Busco como uma oportunidade. Oportunidade de poder conquistar um estagio, \"\r\n"
						+ "				+ \"uma oportunidade de poder desenvolver profissionalmente principalmnete crescer com meritocracia.");
				break;
				
			}
			
		} while(Options == 0);
		
		
		sc.close();
		
		
	}
}


