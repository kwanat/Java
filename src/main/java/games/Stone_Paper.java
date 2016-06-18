package games;

public class Stone_Paper extends Game{

	@Override
	void nextRound(int playerChoice, Gamer gamer,Values values) {
		// TODO Auto-generated method stub
		computerChoice=generator.nextInt(3)+1;
		switch(playerChoice){
		case 1:
			if(computerChoice==2){ 
				values.addComputerScore(values.getWinValue());
				gamer.addPoints(values.getLostValue());
			}
			else if(computerChoice==3) {
				values.addComputerScore(values.getLostValue());
				gamer.addPoints(values.getWinValue());
			}
			else {
				values.addComputerScore(values.getWinValue());
				gamer.addPoints(values.getWinValue());
			}
				 
			
		case 2:
			if(computerChoice==1){
				values.addComputerScore(values.getLostValue());
				gamer.addPoints(values.getWinValue());
			}
			else if(computerChoice==3) { 
				values.addComputerScore(values.getWinValue());
				gamer.addPoints(values.getLostValue());
			}
			else{
				values.addComputerScore(values.getWinValue());
				gamer.addPoints(values.getWinValue());
			}
				
		case 3:
			if(computerChoice==1){ 
				values.addComputerScore(values.getWinValue());
				gamer.addPoints(values.getLostValue());
			}
			else if(computerChoice==2){
				values.addComputerScore(values.getLostValue());
				gamer.addPoints(values.getWinValue());
			}
			else{
				values.addComputerScore(values.getWinValue());
				gamer.addPoints(values.getWinValue());
			}
		}
	}

	@Override
	String getfirstOption() {
		// TODO Auto-generated method stub
		return "ROCK";
	}

	@Override
	String getsecoundOption() {
		// TODO Auto-generated method stub
		return "PAPER";
	}

	@Override
	String getthirdOption() {
		// TODO Auto-generated method stub
		return "SCISSORS";
	}
	
	

}
