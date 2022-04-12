package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account(1001, "Alex", 0.00);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		//upcasting
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Jose", 0.0, 700.00);
		acc = new SavingsAccount(1005, "Joao", 0.0, 0.01);
		
		//DOUNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		
		if(acc4 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc4;
			acc5.loan(200.00);
		}
		
		acc4.deposit(1000.00);
		acc4.withdraw(200.00);
		
		System.out.println(acc4.getBalance());
		
		
		
	}

}
