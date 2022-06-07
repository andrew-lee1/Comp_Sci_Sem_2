package pkg;
import java.util.Scanner;
import java.util.Random;

class Dwarf {
	String name;
	int age;

	public Dwarf() {
		name = "";
		age = 0;
	}
public void setName(String name){
	this.name = name;
}
public String getName(){
	return name;
}
public void setAge(int age){
	this.age = age;
}
public int getAge(){
	return age;
}
public boolean isSameName(String name){
	this.name = name;
}
}
}
}
