package Day29_arrays_Lab;

public class Lab4_Question21mine {

	public static void main(String[] args) {
		int[] x = {1,2,2,3,2,2};
		int[] y = {1, 2, 1,2};
		int[] a = {2,1,2};
		int[] b = {2,2,1,2};
		
		System.out.println(printsum(x));
		System.out.println(printsum(y));

	}
	
	public static boolean printsum(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				count++;
			}
		}
		if(count==4) {          //4*2=8
			return true;
		}
		return false;	
		
	}
}
