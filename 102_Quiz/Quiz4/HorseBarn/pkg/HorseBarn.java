package pkg;
import java.util.Scanner;
import java.util.Random;


public class HorseBarn {
	private Horse[] spaces;
	public int findHorseSpace(String name){
		int i;
		for(i = 0; i < spaces.length; i++){
			if(spaces[i].getName().equals(name)){
				return i;
			}
				return -1;
			
		}
	}
	public void consolidate(){
		Horse[] spaces2 = new Horse[spaces.length];
		int j;
		for(int i = 0; i < spaces.length; i++){
			if(spaces[i] != null){
				spaces2[j] = spaces[i];
				j++;
			}
		}
		
	}

}
