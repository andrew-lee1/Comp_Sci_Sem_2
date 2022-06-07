package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	public String name;

	public Ogre() {
		name = "Shrek";
	
		
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(){
		boolean ugly = true;
		return ugly;
	}

	public void interact(Donkey donkey){
		System.out.println(donkey.name + ", what are you doing in my swamp?!");
		return;
	}


}
