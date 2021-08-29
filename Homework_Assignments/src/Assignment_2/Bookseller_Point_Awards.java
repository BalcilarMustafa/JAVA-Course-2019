package Assignment_2;

public class Bookseller_Point_Awards {

	public static void main(String[] args) {

		String books="4";  //number of books: 0, 1, 2, 3 or 4
		int boughtBook;
		int pointsAward;
		
				switch(books) {
				case "0":
					boughtBook=0;	
					pointsAward=0;			
					System.out.println("You bought " +boughtBook +" books and awarded as "  +pointsAward + " points." );
					break;
				case "1":
					boughtBook=1;
					pointsAward=5;
					
					System.out.println("You bought " +boughtBook +" books and awarded as "  +pointsAward + " points." );
					break;
				case "2":
					boughtBook=2;
					pointsAward=15;
					
					System.out.println("You bought " +boughtBook +" books and awarded as "  +pointsAward + " points." );
					break;
				case "3":
					boughtBook=3;
					pointsAward=30;
					
					System.out.println("You bought " +boughtBook +" books and awarded as "  +pointsAward + " points." );
					break;
				case "4":
					boughtBook=4;
					pointsAward=60;
					
					System.out.println("You bought " +boughtBook +" or more books and awarded as "  +pointsAward + " points." );
					break;
				default:
					System.out.println("The input is invalid ");
					
				}
	}

}
