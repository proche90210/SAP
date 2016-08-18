package sap;

public class Facade {

	public void generateSequence(int sequenceNum) {

		//create objects so that their sequences can be accessed
		INumberSequence fib = new Fibonacci();
		INumberSequence lucas = new Lucas();
		INumberSequence goldenRatio = new GoldenRatio();

		//print to the console before sequences are printed
		System.out.println("Proving that the Lucas numbers come closer to the Golden Ratio than the Fibonacci numbers: ");
		System.out.println("Fibonacci \t\t Lucas \t\t Phi Rounded");

		//loop until sequencesNum is reached - calling the methods to get the next number each time 
		for(int i = 1; i <= sequenceNum; i++){
			System.out.println(fib.getNextNumber(i) + "\t\t\t " + lucas.getNextNumber(i) + "\t\t\t " + goldenRatio.getNextNumber(i));
		}
	}
}
