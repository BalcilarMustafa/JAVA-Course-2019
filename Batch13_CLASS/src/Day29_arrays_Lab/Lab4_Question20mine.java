package Day29_arrays_Lab;

public class Lab4_Question20mine {

	public static void main(String[] args) {
		int[] x = {1,2,2};
		int[] y = {1, 2, 1,2};
		int[] a = {2,1,2};
		int[] b = {2,2,1,2};
		
		System.out.println(tw0totwo(x));
		System.out.println(tw0totwo(y));
		System.out.println(tw0totwo(a));
		System.out.println(tw0totwo(b));
		
	}
	
	public static boolean tw0totwo(int[] arr) {
		boolean flag=false;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==2  && arr[i+1]==2) {
				flag=true;
				break;
					}
			}
		return flag;
	}
}
