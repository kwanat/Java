package games;

public class GamePlayModel {
	Gamer gamer;
	Game game;
	Values values;
	int currentRound;
	public GamePlayModel(Gamer gamer, Game game, Values values){
		this.game=game;
		this.gamer=gamer;
		this.values=values;
		currentRound=1;
	}
	public int getWinner(){
		if(gamer.Score>values.computerScore)
			return 1;
		else
			return 0;
	}
	
	public String getPlayerReaction(int type){
		if(type==0){
			return gamer.lostReaction();
		}
		else
			return gamer.winReaction();
	}
	public void clearScore(){
		gamer.Score=0;
		values.computerScore=0;
	}

}
