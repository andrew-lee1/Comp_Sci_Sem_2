import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Dog Snoopy = new Dog();						// Default Constructor
		Dog Snoopy2 = new Dog(36);					// Age Constructor
		Dog Snoop3 = new Dog(true);					// Trained Constructor
		Dog Toto = new Dog("Toto");					// Name Constructor
		Dog Clifford = new Dog("Clifford", true);	// Name, Trained Constructor
		Dog Scooby = new Dog("Scooby", 50, false);	// Name, Age, Trained Constructor

		Cat Felix = new Cat("Felix", 100, true);	// Name, Age, Trained Constructor
		hedgehog [] x = new hedgehog[5];
		int counter = 0;
		while(counter<x.length){
			x[counter] = hedgehog();
			counter++;
		}
		counter = 0;while(counter<x.length){
			x[counter].trick();
			counter ++;
		}
		mouse y = new mouse[5];
		counter = 0;
		while(counter<y.length){
			y[counter]= new mouse();
			counter ++;
		}
		counter = 0;
		while(counter<y.length){
			y[counter].trick();
		}
		System.out.println();
		Clifford.trick();							// Trained trick
		Scooby.trick();								// Untrained trick
		Felix.trick();
	}
}