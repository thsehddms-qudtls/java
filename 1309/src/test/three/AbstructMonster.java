package test.three;

public abstract class AbstructMonster {
	String name;
	int hp, attack, defense;
	
	public AbstructMonster(String name, int hp, int attack, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	void defense(int attack, int defens) {
		if(defens < attack) {
			hp --;
			System.out.println(false);
		}
		else if(defens > attack) {
			System.out.println(true);
		}
	}
	
}
