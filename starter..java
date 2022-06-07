import java.util.Scanner;

public class CodeWordChecker implements StringChecker{
	private int min;
	private int max
	private String notWord;
	public CodeWordChecker(String a){
		min = 6;
		max = 20;
		this.notWord = a;
	}
	public CodeWordChecker(int a, int b, String c){
		this.min = a;
		this.max = b;
		this.notWord = c;
	}
	public boolean isValid(String a){
		if(a.length >= min && a.length <= max && a.indexOf(notWord) == -1){
			return true;
		}
		else{
			return false;
		}
	}
}
}


		
		
		
		
		
		
		
		
		
}
