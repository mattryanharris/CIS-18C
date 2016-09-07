// Name:  Matthew Harris
// Class: CIS-18C
// -------------------------

import java.text.DecimalFormat;

public class TestScores {

	// Add an invalid number to see it to produce an error
	static double []testScores = {96.7, 38.9, 88.4,87.2,83.9};
	
	public static void main(String[] args) {
		
		double scores = averageScores();
		
		DecimalFormat twoDigit = new DecimalFormat("###.00");
						
		try {
			for(int i = 0; i < testScores.length; i++) {
				if (testScores[i] < 0 || testScores[i] > 100) {
					throw new IllegalArgumentException();
				}
			}
		}
		
		catch(IllegalArgumentException e) {
			System.out.println("Error: Test score not valid");
			return;
		}
		
		System.out.print("Average Test Scores: " + twoDigit.format(scores));
		
	}
	
	public static double averageScores() {
		double scores = 0;
		
		for(int i = 0; i < testScores.length; i++) {
			scores += testScores[i];
		}
		
		scores = scores / testScores.length;
		
		return scores;
	}
}