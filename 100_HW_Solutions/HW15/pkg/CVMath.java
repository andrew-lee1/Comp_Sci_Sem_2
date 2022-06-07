package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	
	{
		
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static boolean checkSquare(int a){
		for(int i = 1; i*i<=a; i++){
			if(i * i == a){
				return true;
				
			}
		}
		return false;
	}
	public static boolean checkAdd(int a){
		int sum = 1;
		for(int i = 2; sum<=a; i++){
			if(sum == a){
				return true;
			}
			sum = sum + i; 
		}
		return false;
	}
	public static void checkMagicsqrs(int n){
		int count = 0;
		int num = 1;
		while(count < n){
			if(checkAdd(num)&&checkSquare(num)){
				count++;
				System.out.println(num);
			}
			num ++;
		}
	}
}
