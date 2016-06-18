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

}
