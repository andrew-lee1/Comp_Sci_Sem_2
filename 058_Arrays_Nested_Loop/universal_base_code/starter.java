import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the Width?");
		int width = sc.nextInt();
		System.out.println("What is the height?");
		int height = sc.nextInt();
		System.out.println("What symbol should we use?");
		String symbol = sc.nextLine();
		
		for(int i=0; i<width; i++){
			for(int c=0; c < height; c++){
				System.out.println(symbol);
		}
}
		
	}
}
