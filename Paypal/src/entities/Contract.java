package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract  {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	
	public Contract() {
		
	}


	public Contract(int number, Date date, double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	
	List<Installment> instalmnets = new ArrayList<Installment>();
	

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public double getTotalValue() {
		return totalValue;
	}


	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}


	public List<Installment> getInstalmnets() {
		return instalmnets;
	}


		
	
	
	
}
