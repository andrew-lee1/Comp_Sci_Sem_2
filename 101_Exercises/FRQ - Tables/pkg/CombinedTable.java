package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable extends SingleTable {
	public CombinedTable(SingleTable t1, SingleTable t2){
		int seats;
		SingleTable t1;
		SingleTable t2;
		double viewQuality;
	}
	public int seats(int t1, int t2){
		int totalSeats = t1.getNumSeats(a) + t2.getNumSeats(b) - 2;
	}
	public boolean canSeat(int a){
		if(a < totalSeats){
			return true;
		}
		else{
			return false;
		}
	}
	public int Desirability(int a, int b, int c, int d){
		int Desire;
		if(t1.getHeight(a) == t2.getHeight(b)){
			Desire = (t1.getViewQuality(c) + t2.getViewQuality(d)) / 2;
		}
		else{
			Desire = (SingleTable.getViewQuality(c) + SingleTable.getViewQuality(d)) / 2 - 10;
		}
	}
}

