import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Perfomer a = new Performer("Bruno Mars");
		Musician b =  new Performer();
		Apprentice c = new Musician();
		Actor d =  new Performer();
		Performer.perform();
		Performer.practice();
		Musician.perform();
		Apprentice.practiceAtUniversity();
		Apprentice.playInstrument();
		Actor.monologue();
		Actor.perform();

		
	}
}
