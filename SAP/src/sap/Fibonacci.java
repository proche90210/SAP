package sap;

public class Fibonacci implements INumberSequence {

	@Override
	public int getNextNumber(int n)  {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return getNextNumber(n - 1) + getNextNumber(n - 2);
	}
}

