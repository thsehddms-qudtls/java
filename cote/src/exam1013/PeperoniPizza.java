package exam1013;

public class PeperoniPizza extends Pizza{
	public PeperoniPizza() {this("M");}
	public PeperoniPizza(String size) {
		this.name = "페퍼로니피자";
		this.size =size;
		this.prices = new int[] {1000, 1500, 25000};
		this.topings = "pepperoni";
	}
	
	public void cook() {
		System.out.println(topings+"를 추가 합니다.");
		super.cook();
	}
}
