package Day9_controlFlowStatements_Part3;

public class laptopModels {

	public static void main(String[] args) {

		String computer="Apple";
		
		switch(computer) {
		case "Apple":
			System.out.println("No virus");
			break;
		case "Dell":
			System.out.println("Tough One");
			break;
		case "Acer":
			System.out.println("Not recommended");
			break;
		default:
			System.out.println("Do not buy that one");
			
		}
	}

}
