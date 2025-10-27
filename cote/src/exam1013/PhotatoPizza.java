package exam1013;

public class PhotatoPizza extends Pizza{
	public PhotatoPizza() {this("M");}
	public PhotatoPizza(String size) {
		this.name = "포테토피자";
		this.size =size;
		this.prices = new int[] {1000, 1500, 25000};
		this.topings = "photato";
	}
	
	public void cook() {
		System.out.println(topings+"를 추가 합니다.");
		super.cook();
	}
}
