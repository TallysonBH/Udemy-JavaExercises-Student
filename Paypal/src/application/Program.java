package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContratcService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		OnlinePaymentService ps = new PaypalService();
		
		
		
		
		System.out.println("Enter contract data");
		System.out.print("Mumber: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int mounth = sc.nextInt();
		
		Contract contract = new Contract(number, date, value);
		
		ContratcService cs = new ContratcService(ps);
		
		cs.processContract(contract, mounth);
		
		
		
		
		System.out.println("Installments:");
		
		for (Installment it: contract.getInstalmnets()) {
			System.out.println(it);
			
		}
		
		
		
		sc.close();
		
	}

}
