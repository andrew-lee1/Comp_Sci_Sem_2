package pkg;
import java.util.Scanner;
import java.util.Random;


public class Rogue {
	public int health;
	public String name;
	public int attack;
	public Rogue(int health, int attack, String name) {
		Random rand = new Random();
		health = rand.nextInt(15)+1;
		name = "Bob";
		attack = rand.nextInt(15)+1;
	}
	public Rogue(String name){
		this(rand.nextInt(15)+1, name, rand.nextInt(15)+1);
	}
	public void setHealth(int health){
		health = rand.nextInt(15)+1;
	}
	public int getHealth(int health){
		return health;
	}
	public String getName(String name){
		return name;
	}
	public void attack(Warrior a){
		Random a =  rand.nextInt(attack)+1;
	Warrior.health = Warrior.health-attack;
	}
	public void attack(Wizard b){
		Random b = rand.nextInt(attack)+1;
		wizard.health =  Wizard.health-attack;
	}
}

