package projectTwo;

import java.util.Scanner;

public class TestScores {


	private static double _average;
	
	public TestScores(int[] input){	//constructor
		
	}
	
	//mutators
	public double get_average() {
		return _average;
	}


	public void set_average(int[] numbersIncoming) {
		int temp=0;
		for(int i = 0; i < numbersIncoming.length; i++){
			temp +=numbersIncoming[i];
		}
		_average =  temp / numbersIncoming.length;
		
		this._average = _average;
	}


	
	

}
