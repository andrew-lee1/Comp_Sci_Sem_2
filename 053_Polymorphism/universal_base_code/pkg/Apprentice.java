package pkg;
import java.util.Scanner;
import java.util.Random;


public class Apprentice extends Musician{
	String school;
	int yearsOfExperience;

	public Apprentice() {
		school = "CVHS";
		yearsOfExperience = 0;
	}
	public Apprentice(String school, int yearsOfExperience){
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
	}
	public Apprentice(String school, int yearsOfExperience, String instrument){
		super(instrument);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
		
	}
	public Apprentice(String school, int yearsOfExperience, String instrument, String name, int age){
		super(instrument, name , age);
		this.school = school;
		this.yearsOfExperience = yearsOfExperience;
		
	}
	public void playInstrument(){
        System.out.println(name + " Plays " + instrument);
    }
	public void oldPractice(){
		System.out.println(name + " is practicing!!");
	}
	public void newPractice(){
		System.out.println(yearsOfExperience + " years of practicing!");
	}
	public void oldPerform(){
		System.out.println(name + " is performing!");
	}
	public void newPerfrom(){
		System.out.println(name + " is performing again!");
	}
	public void practiceAtUniversity(){
		System.out.println(name + " practiced at the university for " + yearsOfExperience + "years!");
	}
}


