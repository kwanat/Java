package games;

public class Values {
	int winValue;
	int lostValue;
	int computerScore;
	int numberofRounds;
	
	Values(int win, int lost,int rounds){
		this.winValue=win;
		this.lostValue=lost;
		this.numberofRounds=rounds;
		this.computerScore=0;
	}
	public void setValues(int win, int lost){
		this.winValue=win;
		this.lostValue=lost;
	}
	public int getWinValue(){
		return this.winValue;
	}
	public int getLostValue(){
		return this.lostValue;
	}
	public int getComputerScore(){
		return this.computerScore;
	}
	public void addComputerScore(int value){
		this.computerScore+=value;
	}

}
