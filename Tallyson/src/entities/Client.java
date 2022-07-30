package entities;

import java.util.Date;

public class Client {
	
	private String Name;
	private Date Birth;
	private Integer Doc;
	private Integer Phone;
	
	public Client client;
	
	
	public Client(String name, Date birth, Integer doc, Integer phone) {
		Name = name;
		Birth = birth;
		Doc = doc;
		Phone = phone;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getBirth() {
		return Birth;
	}
	public void setBirth(Date birth) {
		Birth = birth;
	}
	public Integer getDoc() {
		return Doc;
	}
	public Integer getPhone() {
		return Phone;
	}
	public void setPhone(Integer phone) {
		Phone = phone;
	}
	
	
	
	

}
