package test.three;

public class Defender extends AbstructMonster{
	
	public void Defender() {
		this.name = "Defender";
		this.hp = 20;
		this.attack = 13;
		this.defense = 25;
	}
	
	public void attack() {
		System.out.println("Defenser - VeryStrong");
	}
}
