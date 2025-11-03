package exam1029;

public class ClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clickable c1 = new Image("a.jpg");
		Clickable c2 = new Image("OK");
		
		c1.click();
		c2.click();
		
		Drawable d1 = (Image) c1;
		Drawable d2 = (Button) c2;
		
		d1.draw();
		d2.draw();
		
		if(c1 instanceof Image) {
			Image i = (Image) c1;
			System.out.println(i.url);
			Drawable d = i;
			d.draw();
		}
		if(c2 instanceof Button) {
			Button b = (Button) c2;
			System.out.println(b.label);
			Drawable d = b;
			d.draw();
		}
	}

}