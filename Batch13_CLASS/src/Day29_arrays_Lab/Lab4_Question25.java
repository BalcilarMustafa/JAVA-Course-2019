package Day29_arrays_Lab;

public class Lab4_Question25 {

	public static void main(String[] args) {

		int[] x = {1,2,3};
		int[] y = {2,3,10};
		int[] a = {2,3,5};
		int[] b = {4,2,5};
		
		System.out.println(differless2(x,y));
		System.out.println(differless2(x,a));
		System.out.println(differless2(x,b));
	}
	
	public static int differless2(int[] arr, int[] array) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-array[i]==1||array[i]-arr[i]==1) {
				count++;
		}else if(arr[i]-array[i]==2||array[i]-arr[i]==2){
			count++;
		}
			}
		return count;
	}
}
