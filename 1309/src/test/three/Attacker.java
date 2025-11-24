package test.three;

public class Attacker extends AbstructMonster{
	
	public void Attacker() {
		this.name = "Attacker";
		this.hp = 30;
		this.attack = 20;
		this.defense = 13;
	}
	
	public void attack() {
		System.out.println("Attacer - VeryStrong");
	}
}
