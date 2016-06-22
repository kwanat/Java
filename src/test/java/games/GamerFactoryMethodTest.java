package games;

import static org.junit.Assert.*;

import org.junit.Test;

public class GamerFactoryMethodTest {

	@Test
	public void test() {
		Gamer gamer=new Preschooler("Adam","Kowalski");
		GamerFactory fact = new GamerFactory();
		assertEquals(gamer.getClass(), fact.createGamer(1, "Michal", "Zablocki").getClass());
	}

}
