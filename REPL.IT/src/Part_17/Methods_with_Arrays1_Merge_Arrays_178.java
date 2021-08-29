package Part_17;

import java.util.Arrays;

public class Methods_with_Arrays1_Merge_Arrays_178 {

	public static void main(String[] args) {

		int [] ar1= {1,2,3};
		int [] ar2=	{4,5,6};
		System.out.println(Arrays.toString(mergR(ar1, ar2)));
}

	
	 public static int[] mergR(int[] a, int[] b) {
		 
		    int [] arr=new int[a.length+b.length];
		    for(int i=0; i<a.length; i++) {
		    	arr[i]=a[i];
		    						      }
		    for(int i=0; i<b.length; i++) {
		    	arr[a.length+i]=b[i];
		    						      }
		    return arr;
}
}
