package test.two;

public class Customer {
	public String name;
	public String phone;
	public int point;
	
	Customer(String name, String phone, int point){
		this.name = name;
		this.phone = phone;
		this.point = 0;
	}
	
	public void updatePoint(int amount) {
		System.out.println("현재포인트" + point + amount + "입니다.");
	}
	
	public void setPoint(int point) {
		this.point = point;
		System.out.println("현재포인트" + point + "입니다.");
	}
	
	
}
