package pkg;
import java.util.Scanner;
import java.util.Random;


public interface Creature{
	
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

}

