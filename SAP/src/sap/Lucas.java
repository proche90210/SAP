package sap;

public class Lucas implements INumberSequence{

	@Override
	public int getNextNumber(int n) {	
		if(n == 1){
			return 2;
		} 
		else if(n == 2) {
			return 1;
		}
		else{
			return getNextNumber(n -1) + getNextNumber(n - 2);
		}
	}
}

