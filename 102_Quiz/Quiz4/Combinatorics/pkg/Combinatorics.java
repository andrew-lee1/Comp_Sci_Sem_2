package pkg;
import java.util.Scanner;
import java.util.Random;


public class Combinatorics {
	public static int factorial(int n){
		int fact = 1;
		for(int i = n; i > 0; i--){
			fact *= i;
		}
		return fact;
	}
	public static void numCombination(int n, int r){
		if(r > n){
			System.out.println("0");
		}	
		int a = factorial(n) / factorial(r) * factorial(n-r);
		System.out.println(a);
	}
		
	}

}
