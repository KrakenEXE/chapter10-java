package projectTwo;

import java.util.Scanner;

public class TestScoresDriver {

	public static void main(String[] args) throws InvalidTestScore {
		
		int[] _testScores = new int[3];
		Scanner scanner = new Scanner(System.in);
		int superGrab=0;
		
		
		
		
		for(int i = 0; i < _testScores.length; i++){
			
			
			System.out.print("Enter a digit from 0 to 100 >> ");
			superGrab = scanner.nextInt();
			
			if(superGrab > 100 || superGrab <0){
				throw new InvalidTestScore();
			}
			else{
				_testScores[i] = superGrab;
			}
			
		}
		TestScores newAverage = new TestScores(_testScores);
		
		newAverage.set_average(_testScores);

		
		System.out.println(newAverage.get_average());
	}
}
