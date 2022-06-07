import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
	String [] name = new String[7];
	name[0]="Sneezy";
	name[1]="Doc";
	name[2]="Happy";
	name[3]="Grumpy";
	name[4]="Sleepy";
	name[5]="Dopey";
	name[7]="Bashful";
	
	int[]age;
	age = new int[100];
	Dwarf[] dwarf = new Dwarf[100];
	for(int x = 0;x<100;x++){
		dwarf[x]=new Dwarf();
	}
		for(int c = 0;c<100;c++){
			int y = Math.random;
			System.out.println("the dwarf name is"+ name.y + "the dwarf is " + age[x]+"years old");
		}

		
	}
}
