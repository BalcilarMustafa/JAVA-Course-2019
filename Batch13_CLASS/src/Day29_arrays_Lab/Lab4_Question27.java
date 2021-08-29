package Day29_arrays_Lab;

public class Lab4_Question27 {

	public static void main(String[] args) {
		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9}; //false
		int[] t = {1,2,108,109,110,9}; //false
		
		System.out.println(adjacentincrease(x));
		System.out.println(adjacentincrease(y));
		System.out.println(adjacentincrease(z));
		System.out.println(adjacentincrease(t));
	}
	public static boolean adjacentincrease(int[] arr) {
		
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i+1]==arr[i]+1 && arr[i+2]==arr[i+1]+1) 
				return true;
			}
				return false;
	}
}
