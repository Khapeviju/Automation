package oops.encapsulation;

public class UserDetails {
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0)
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	private String name;
	
	

}
