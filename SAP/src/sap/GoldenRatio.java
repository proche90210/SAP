package sap;

public class GoldenRatio implements INumberSequence {
	
	private double phi = 1.618;
	private double grNew, grOld = 2;
	int finalNum;
	boolean state = true;
	

	@Override
	public int getNextNumber(int n) {
		int nextNum = (int) getNumbers(n);
		if (nextNum == 1)
			nextNum = 2;
		return nextNum;
	}
	
	public double getNumbers(int n) {
		if(state == true){
				finalNum = n;
				state = false;
		}
		if(n == 1) {
			state = true;
            return 1;
        }
		else {
			grNew = (phi*getNumbers(n - 1));  
			if(n == finalNum){
				return Math.round(grNew);
			}
			else
				return grNew;
		}
	}
}
