package games;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameFactoryTest {

	@Test
	public void test() {
		Game game=new Coins();
		Game_Factory fact = new Game_Factory();
		assertEquals(game.getClass(), fact.createNewGame(1).getClass());
	}

}
