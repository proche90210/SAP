package sap;

public class Main {

	//sequenceNum determines how many iterations of the of the sequences(Lucas, Fibonacci and GoldenRatio) will be run.
	//must be 25 or less or it will fail the unit test
	public static int sequenceNum = 25; 
	
	
	//the facade pattern provides a simplified interface to the overall functionality of a system
	//by calling generateSequence() the facade object carries out and all calcualtions and prints the output to the console.
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.generateSequence(sequenceNum);
		
		System.out.println("Print 1");
		System.out.println("Print 2");

		System.out.println("Hello happy sales people");

		for (int i = 0; i < 3; i++) {
			System.out.println("Print displayData");
		}
		

	}

}
