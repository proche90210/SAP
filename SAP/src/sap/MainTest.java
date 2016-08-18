package sap;

import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {

	@Test
	public void testSequenceNumber() {
		//since sequence number is public and static we can access it with instantiating the class.
		int greatestSequenceNum = 25;
		assertTrue(Main.sequenceNum <= greatestSequenceNum);
	}

}
