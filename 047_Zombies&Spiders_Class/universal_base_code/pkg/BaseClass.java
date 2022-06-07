package pkg;
import java.util.Scanner;
import java.util.Random;

public class Spider{
	int attack;
	String name;
	int health;
}
	public Spider(){
	Random rand = new Random();
	attack = rand.nextInt(5)+5;
	name = "Charlotte";
	health = rand.nextInt(5)+5;
	}
	public boolean isDead(){
		    if(health < attack){
		        return true;
		    }
		    else; {
		        return false;
		    }
		}
		public boolean takeDamage(int a){
		    if(a < health){
		        return true;
		    }
		    else;
		   {
		       return false;
		   }
		}
		public String getName(String a){
		    return a;
		}
		public void attack(Role a){
		    System.out.println(takeDamage);
		}
		public String getColor(String a){
		    return a;
		}
public class Zombie {
	int attack;
	String name;
	int health;

	public Zombie() {
	Random rand = new Random();
	attack = rand.nextInt(5)+5;
	name = "Zack";
	health = rand.nextInt(5)+5;
	}
	public boolean isDead(){
		    if(health < attack){
		        return true;
		    }
		    else; {
		        return false;
		    }
		}
		public boolean takeDamage(int a){
		    if(a < health){
		        return true;
		    }
		    else;
		   {
		       return false;
		   }
		}
		public String getName(String a){
		    return a;
		}
		public void attack(Role a){
		    System.out.println(takeDamage);
		}
		public String getColor(String a){
		    return a;
		}

}

