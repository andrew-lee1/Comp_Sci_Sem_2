package pkg;
import java.util.Scanner;
import java.util.Random;


Public class BatteryCharger{
	private int getChargingCost(int startHour, int chargeTime){
		while(startHour <= chargeTime){
			if(startHour == startHour + chargeTime - 1){
				break;
			}
			rateTable[startHour] + rateTable[startHour + 1];
			startHour = startHour + 2;
			return rateTable[startHour];
		
		} 
	}
	private int getChargeStartTime(int chargeTime){
		for(int y = 0; y<= rateTable.length; y++){
			for(int x = 0; x<= rateTable.length; x++){
			if(getChargingCost(y, x) < getChargingCost(y + 1, x + 1)){
				return x;
			}
	}
	}
	}
}

}

