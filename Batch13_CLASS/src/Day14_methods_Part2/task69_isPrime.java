package Day14_methods_Part2;

public class task69_isPrime {

	public static void main(String[] args) {

		System.out.println(isPrime(37));
	
	}
		
	public static boolean isPrime(int n ) {
		
		if (n==0 || n==1) {
			return false;   
						  }else{
							for(int i=2;i<n;i++) {
		    	
								if(n%i==0)
								return false;
												}
								return true;
 
									}
	}
}
