package test.three;

public class Gane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstructMonster m1 = new Attacker();
		AbstructMonster m2 = new Defender();
		
		
		System.out.println(m1.defense - m2.attack);
		System.out.println(m2.defense - m1.attack);
		
		System.out.println(m1.hp);
		System.out.println(m2.hp);
		
	}

}
