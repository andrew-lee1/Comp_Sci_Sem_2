import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Performer a = new Performer();
		Performer b = new Performer("Bruno Mars", 26);
		Musician c = new Musician();
		Musician d = new Musician("piano", "Bruno Mars", 26);
		a.getName();
		a.practice();
		b.getName();
		b.perform();
		c.getName();
		c.perform();
		c.playInstrument();
		d.practice();
		d.getInstrument();
		
	}
}
