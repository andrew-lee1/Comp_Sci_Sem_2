package pkg;

public class hedgehog {
    int age;
    String name;
    boolean trained;
public hedgehog(){
    this.name="Sonic";
    this.age=31;
    this.trained=true;
}
public hedgehog(String name){
    this.name=name;
    this.age=31;
    this.trained = true;
}
public hedgehog(int age){
    this.age=age;
    this.name = "Sonic";
    this.trained=true;
}
public hedgehog(bollean trained){
    this.name="Sonic";
    this.age=31;
    this.trained=trained;
}
public hedgehog(String name, boolean trained){
    this.name = name;
    this.trained = trained;
    this.age=31;
}
public hedgehog(String name,int age,  boolean trained){
    this.name = name;
    this.trained = trained;
    this.age=age;
}
    public void setName(String name){
        this.name = name;
}
public void setAge(int age){
    this.age = age;
}
}
