import java.util.ArrayList;
import pkg.*;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;

   public OnlinePurchaseManager(){
      purchases = new ArrayList<Gizmo>();
   }
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	double min = 9999;
   	int index = -1;
   	for(int i = 0; i < purchases.size(); i++){
   	   if(purchases.get(i).maker == mkr && purchases.get(i).cost < min){
   	      min = purchases.get(i).cost;
   	      index = i;
   	   }
   	}
   	return purchases.get(index);
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
   public void add(String a, boolean b, double c){
      purchases.add(new Gizmo(a, b, c));
   }
   public int countElectronicsByMaker(String mkr){
      int count = 0;
      for(int i = 0; i < purchases.size(); i++){
         if(mkr == purchases.get(i).maker){
            count++;
         }
      }
      return count;
   }
   public boolean hasAdjacentEqualPair(){
      if(purchases.size < 2){
         return false;
      }
         for(int i = 0; i < purchases.size()-1; i++){
             if(purchases.get(i).equals(purchases.get(i+1))){
                return true;
            }
         }
      return false;
   }
}
