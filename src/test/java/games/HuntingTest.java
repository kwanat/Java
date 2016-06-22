package games;

import static org.junit.Assert.*;

import org.junit.Test;

public class HuntingTest {

	@Test
	public void test() {
		Game test=new Hunting();
		assertEquals(null, test.getthirdOption());
	}

}
