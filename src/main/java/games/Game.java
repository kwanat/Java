package games;

import java.util.Random;

public abstract class Game {
	//int playerChoose;
	int computerChoice;
	Random generator = new Random();
	abstract void nextRound(int playerChoice, Gamer gamer, Values values);

}
