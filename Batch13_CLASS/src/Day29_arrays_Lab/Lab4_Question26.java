package Day29_arrays_Lab;

public class Lab4_Question26 {

	public static void main(String[] args) {
		int x[] = {2,1,3,5}; //true
		int y[] = {2,1,2,5}; //false
		int z[] = {2,4,2,5}; //true

		System.out.println(evensorodds3(x));
		System.out.println(evensorodds3(y));
		System.out.println(evensorodds3(z));
	}
	public static boolean evensorodds3(int[] arr) {
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				count1++;
			}else if(arr[i]%2==0){
				count2++;
			}
			}
		if(count1==3||count2==3) 
			return true;
			return false;

	}
}
