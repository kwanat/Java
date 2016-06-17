package games;

public class GameSelectModel {
	Gamer gamer;
	GamerFactory fact1;
	Game game;
	Game_Factory fact2;
	Values values;
	public GameSelectModel(){
		fact1=new GamerFactory();
		fact2=new Game_Factory();
		
	}
	
	void createNewPlayer(int type, String name,String surname){
		gamer=fact1.createGamer(type, name, surname);
	}
	
	void createNewGame(int type){
		game=fact2.createNewGame(type);
	}
	void setPointsValues(int win, int lost){
		values=new Values(win,lost);
	}

}
