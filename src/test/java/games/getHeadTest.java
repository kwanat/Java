package games;

import static org.junit.Assert.*;

import org.junit.Test;

public class getHeadTest {

	@Test
	public void test() {
		Coins test=new Coins();
		assertEquals("HEAD", test.getfirstOption());
	}

}
