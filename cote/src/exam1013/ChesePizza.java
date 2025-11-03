package exam1013;

public class ChesePizza extends Pizza{
	
	public ChesePizza() {this("M");}
	public ChesePizza(String size) {
		this.name = "치즈피자";
		this.size =size;
		this.prices = new int[] {1000, 1500, 25000};
	}
}