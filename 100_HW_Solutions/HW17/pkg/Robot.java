package pkg;

public class Robot {		
	public boolean forwardMoveBlocked(){
			if(pos == 0 && !facingRight{
				return true;
			}
			else if(pos == hall.length - 1 && facingRight{
				return true;
			}
				return false;
		}
	public void move(){
		if(hall[pos] > 0){
			hall[pos] = hall[pos] - 1;
		}
			if(hall[pos] == 0){
				if(forwardMoveBlocked()){
					facingRight = !facingRight;
			}
			else if(facingRight){
				pos++;
			}else{
				pos--;
			}
		}
	public int clearHall(){
		for(int pos = 0; pos<hall.length; pos++){
			if(hall[pos] == 0){
				System.out.println(move);
			}
		}
	}
}
}
