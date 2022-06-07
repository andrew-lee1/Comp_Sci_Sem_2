package pkg;
import java.util.Scanner;
import java.util.Random;



public class Musician extends Performer{
    String instrument;
    
    public Musician(){
        super();
        instrument = "Cello";
    }
    public Musician(String name, String instrument){
    	super(name);
    	this.instrument = instrument;
    }
    public Musician(String instrument, String name, int age){
        super(name, age);
        this.instrument = instrument;
    }
    public String getInstrument(){
        return instrument;
    }
    public void playInstrument(){
        System.out.println("Plays " + instrument);
    }
}
