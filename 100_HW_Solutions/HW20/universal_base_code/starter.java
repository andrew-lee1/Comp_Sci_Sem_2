import pkg.*;
import java.util.*;

class starter {
	public static void bubble(int[] arr){
		for(int outer = 0; outer < arr.length-1; outer++){
			for(int inner = 0; inner < arr.length-outer-1;inner){
				if(arr[inner] > arr[inner + 1]){
					int temp = arr[inner];
					arr[inner] = arr[inner + 1];
					arr[inner + 1]= temp;
				}
			}
		}
	}
	public static void selection(int [] arr){
		int outer, inner, min_index;
		for(outer = 0;outer < arr.length;outer++){
			min_index = outer;
			for(inner = outer+1;inner<arr.length;inner++){
				if(arr[inner] < arr[min_index]){
					min_index = inner;
				}
			}
			int temp = arr[outer];
			arr[outer] = arr[min_index];
			arr[min_index] = temp;
		}
	}
	public static void insertion(int[] arr){
		int outer, inner, key;
		for(outer = 1; outer < arr.length; outer++){
			key = arr[outer];
			inner = outer-1;
			while(inner >= 0 && arr[inner] > key){
				arr[inner + 1] = arr[inner];
				inner = inner -1;
			}
			arr[inner + 1] = key;
		}
	}
	public static void main(String args[]) {
		ArrayList<Integer> a = new ArrayList<Integer>(100);
		randomArr(a, 100);
		System.out.println(arr[a]);
		System.out.println(bubble(arr[a]));
		System.out.println(selection(arr[a]));
		System.out.println(insertion(arr[a]));
		System.out.println((a[50] + a[49]) / 2);
		
		
		
	}
}
