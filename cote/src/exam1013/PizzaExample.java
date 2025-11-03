package exam1013;

import java.util.Scanner;
public abstract class PizzaExample {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	String size = sc.next();
	sc.close();
	
	Pizza pizza;
	if(name.equals("C")) {
		pizza = new ChesePizza(size);
	}
	else if(name.equals("P")) {
		pizza = new PhotatoPizza(size);
	}
	else {
		pizza = new PeperoniPizza(size);
	}
	pizza.cook();
	pizza.serve();
	}
}
