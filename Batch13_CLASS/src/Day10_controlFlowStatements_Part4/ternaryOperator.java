package Day10_controlFlowStatements_Part4;

public class ternaryOperator {

	public static void main(String[] args) {
		
		String result;
		int score=88;
//		
//		if(score>60) {
//			result="pass";
//		}else {
//			result="fail";
//		}
		
		result=score>60?"pass":"fail";
		System.out.println(result);
		
		int x=1;
		System.out.println(x>2?x<4?10:8:7);
		
		if(x>2) {
			if(x<4) {
				System.out.println(10);
			}else {
				System.out.println(8);
			}
		}else {
			System.out.println(7);
		}

	}

}
