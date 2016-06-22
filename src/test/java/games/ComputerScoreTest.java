package games;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerScoreTest {

	@Test
	public void test() {
		Values values=new Values(0, 0, 0);
		assertEquals(0, values.getComputerScore());
	}

}
