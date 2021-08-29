package Day23_stringManipulationLab_randomClasss;

public class Question_16 {

	public static void main(String[] args) {
		String str = "ly";
		String str1;
		
		if(str.length()<2) {
			str1=(str+"@");
		}else {
			str1=str.substring(0,2);
		}
		
		System.out.println(str1);
	}

}
