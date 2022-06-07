import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Apprentice a = new Apprentice();
		Apprentice b = new Apprentice("UCLA", 5);
		Apprentice c = new Apprentice("Standford", 6, "Guitar");
		Apprentice d = new Apprentice("USC", 7, "Piano", "Bob", 32);
		b.newPractice();
		c.oldPerform();
		d.practiceAtUniversity();
		
	}
}
