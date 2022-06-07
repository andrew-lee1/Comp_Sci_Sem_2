package pkg;

public class Gizmo
{ 
   String maker;
   boolean isE;
   double cost;
   public Gizmo(String a, boolean b, double c){
      maker = a;
      isE = b;
      cost = c;
   }
   public String toString()
   {
   	return "" + maker + " " + isE + " " + cost;
   }
   public boolean isElectronic(){
      return this.isE;
   }
   public String getMaker(){
      return this.maker;
   }
   public boolean equals(Gizmo b){
      return this.maker == b.maker && this.isE == b.isE && this.cost == b.cost;
   }
}
