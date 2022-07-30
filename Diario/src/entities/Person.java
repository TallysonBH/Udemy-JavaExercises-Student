package entities;

public class Person {
	
	public String name;
	public int age;
	public String Locale;
	
	
	public Person(String name, Integer age, String locale) {
		this.name = name;
		this.age = age;
		Locale = locale;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getLocale() {
		return Locale;
	}
	public void setLocale(String locale) {
		Locale = locale;
	}
	
	

}
