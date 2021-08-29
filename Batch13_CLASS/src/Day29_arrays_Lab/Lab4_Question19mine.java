package Day29_arrays_Lab;

public class Lab4_Question19mine {

	public static void main(String[] args) {
		
		int[] x = {1,2,2};
		int[] y = {1, 2, 2, 6, 99, 99,7};
		int[] a = {1,1,6,7,2};
		int[] b = {1,1,6,2};
		int[] c = {1,2,2,6,99,99,7,3,4};
		int[] d = {1,2,2,6,99,99,3};
		
		exc67(x);
		exc67(y);
		exc67(a);
		exc67(b);
		exc67(c);
		exc67(d);
	}
	
	public static void exc67(int[] arr) {
		
		int sum=0, a=0, b=0 ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=6) {
				sum=sum+arr[i];}
			else {
				break;}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==6) {a=i;}
			if(arr[i]==7) {b=i;}
		}
		if(a<b) {
			for(int i=b+1;i<arr.length;i++) {
				sum=sum+arr[i];
			}	
		}
		
		System.out.println(sum);
   }
  }
