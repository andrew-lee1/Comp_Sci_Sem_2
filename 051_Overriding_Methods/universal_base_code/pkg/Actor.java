package pkg;
import java.util.Scanner;
import java.util.Random;


public class Actor{
		String type;
		String name;
	public Actor(){
		type = "theatre";
	}
	public Actor(String name, String type){
		this.name = name;
		this.type = type;
	}
	public String practice(String a){
		String p = name + " is practicing!";
		return p;
	}
	public String perform(String a){
		String z = name + " is performing";
		return z;
	}
	public void monologue(){
		System.out.println("How are you doing?");
	}
	}



