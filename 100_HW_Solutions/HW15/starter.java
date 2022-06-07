import pkg.*;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
	int [][] arr = new int[5][4];
	for(int x = 0; x < arr.length; x++){
		for(int y = 0; y < arr[0].length; y++){
			arr[x][y] = 5;
		}
	}
	System.out.println(arr);
	}
}
