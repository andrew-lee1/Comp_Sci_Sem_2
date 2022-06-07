package pkg;

public class mouse{
    int age;
    String name;
    boolean trained;
public mouse(){
    this.name="Jerry";
    this.age=2;
    this.trained=true;
}
public mouse(String name){
    this.name=name;
    this.age=2;
    this.trained = true;
}
public mouse(int age){
    this.age=age;
    this.name = "Jerry";
    this.trained=true;
}
public mouse(bollean trained){
    this.name="Jerry";
    this.age=2;
    this.trained=trained;
}
public mouse(String name, boolean trained){
    this.name = name;
    this.trained = trained;
    this.age=2;
}
public mouse(String name,int age,  boolean trained){
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

}				// The pet performs a trick if the pet is trained. If not, the pet just acts normal.
