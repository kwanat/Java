package games;

import java.util.Random;

public abstract class Game {
	//int playerChoose;
	int computerChoice;
	Random generator = new Random();
	abstract void nextRound(int playerChoice, Gamer gamer, Values values);
	abstract String getfirstOption();
	abstract String getsecoundOption();
	abstract String getthirdOption();
	abstract String getPlayerChoice(int choice);
	abstract String getComputerChoice();
}
