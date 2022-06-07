import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Musician a = new Musician("Bruno Mars", "Piano");
		Musician b = new Musician("piano", "Bruno Mars", 26);
		a.getName();
		a.practice();
		a.getInstrument();
		b.getName();
		b.perform();
		b.playInstrument();

		
	}
}
