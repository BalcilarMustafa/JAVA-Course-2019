package Day27_arrays_part4;

public class task95_ScoreCalc {

	public static void main(String[] args) {
		
		int[][] scores = {
				{68,75,54,80}, //student-0
				{100,64,20,50},
				{10,35,40,90}
		};
		
		int sum=0;
		for(int column=0;column<scores[0].length;column++) {
			
			sum = sum + scores[0][column];///sum first row
	}
		System.out.println(sum);
		System.out.println(sum/scores[0].length);
		
		System.out.println("===============with For Each===============================");
		int sum1=0;
		for(int column: scores[0]) {
		sum1=sum1+column;///sum first row
		}
		System.out.println(sum1);
		System.out.println(sum/scores[0].length);
		System.out.println("==============================================");
		
		int sum2=0;
		for(int row=0;row<scores.length;row++) {
			
			sum2 = sum2 + scores[row][0];///sum first column
			
		}
		System.out.println(sum2);
		
		System.out.println("===============with For Each===============================");
		int sum3=0;
		for(int[] score: scores) {
		sum3=sum3+score[0];///sum first column
		}
		System.out.println(sum3);	
	}
}
