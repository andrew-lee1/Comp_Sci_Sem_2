import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Performer a = new Performer("Bruno Mars");
		Musician b =  new Musician("Bruno Mars", "Cello");
		Apprentice c = new Apprentice("UCLA", 5, "Cello", "Bruno Mars", 20);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a.equals(b));

		
	}
}
