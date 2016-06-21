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
				 
			break;
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
			break;
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
			break;
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

	@Override
	String getPlayerChoice(int choice) {
		// TODO Auto-generated method stub
		switch(choice){
		case 1:
			return this.getfirstOption();
		case 2:
			return this.getsecoundOption();
		case 3:
			return this.getthirdOption();
		}
		return null;
	}

	@Override
	String getComputerChoice() {
		// TODO Auto-generated method stub
		switch(this.computerChoice){
		case 1:
			return this.getfirstOption();
		case 2:
			return this.getsecoundOption();
		case 3:
			return this.getthirdOption();
		}
		return null;
	}
	
	

}
