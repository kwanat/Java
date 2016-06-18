package games;

public class Coins extends Game{

	@Override
	void nextRound(int playerChoice, Gamer gamer, Values values) {
		// TODO Auto-generated method stub
		computerChoice=generator.nextInt(3)+1;
		if(playerChoice==computerChoice){
			values.addComputerScore(values.getLostValue());
			gamer.addPoints(values.getWinValue());
		}
		else{
			values.addComputerScore(values.getWinValue());
			gamer.addPoints(values.getLostValue());
		}
		
	}

	@Override
	String getfirstOption() {
		// TODO Auto-generated method stub
		return "HEAD";
	}

	@Override
	String getsecoundOption() {
		// TODO Auto-generated method stub
		return "TAIL";
	}

	@Override
	String getthirdOption() {
		// TODO Auto-generated method stub
		return null;
	}


}
