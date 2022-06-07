package pkg;
import java.util.Scanner;
import java.util.Random;


public interface role {
	public void attack();

}
	public class Rogue implements role {
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
	public void attack(role){
		Random a =  rand.nextInt(attack)+1;
	role.health = role.health-attack;
	}
		
	}

}

