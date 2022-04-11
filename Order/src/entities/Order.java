package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus orderStatus;
	private Client client;
		
	private List<Orderitem> items = new ArrayList<Orderitem>();
	
	
	public Order() {
	}


	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}


	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	

	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}



	public void addItem(Orderitem orderItem) {
		items.add(orderItem);
	}
	public void removeItem(Orderitem orderItem) {
		items.remove(orderItem);
	}

	
	public double total() {
		double sum = 0;
		for(Orderitem it : items) {
			sum += it.subTotal();
		}
		
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status: ");
		sb.append(orderStatus + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items: \n");
		for(Orderitem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
	}
}
