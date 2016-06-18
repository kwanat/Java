package games;

public class Hunting extends Game {

	@Override
	void nextRound(int playerChoice, Gamer gamer, Values values) {
		// TODO Auto-generated method stub
		computerChoice=generator.nextInt(3)+1;
		if((playerChoice==1)&&(computerChoice==1)){
			values.addComputerScore(values.getWinValue());
			gamer.addPoints(values.getWinValue());
		}
		else if((playerChoice==1)&&(computerChoice==2)){
			values.addComputerScore(values.getLostValue());
			gamer.addPoints(values.getWinValue());
		}
		else if((playerChoice==2)&&(computerChoice==2)){
			values.addComputerScore(2*values.getWinValue());
			gamer.addPoints(2*values.getWinValue());
		}
		else{
			values.addComputerScore(values.getWinValue());
			gamer.addPoints(values.getLostValue());
		}
	}

	@Override
	String getfirstOption() {
		// TODO Auto-generated method stub
		return "HARE";
	}

	@Override
	String getsecoundOption() {
		// TODO Auto-generated method stub
		return "DEER";
	}

	@Override
	String getthirdOption() {
		// TODO Auto-generated method stub
		return null;
	}

}
