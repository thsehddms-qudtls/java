package exam1013;

public class Pizza {
	public String name;
	public String size;
	public int[] prices;
	public String topings;
	
	public void cook() {
		System.out.println(name+ size+" 을 조리합니다.");
		System.out.println(name+ size+" 을 완성되었습니다.");
	}
	
	public void serve() {
		int price;
		switch(size) {
		case "S": price =prices[0]; break;
		case "M": price =prices[1]; break;
		default : price = prices[2];
		}
		/*
		if(size.equals("S")) price =prices[0];
		else if(size.equals("M")) price =prices[1];
		else price = prices[2];
		*/
		System.out.println(name+ size+" 을 드립니다. 가격:"+price);
	}
}
