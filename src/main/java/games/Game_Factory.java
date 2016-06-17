package games;

public class Game_Factory {
	//implements Factory design pattern
	public Game createNewGame(int type){
	Game game=null;
	switch(type){
	case 1:{
		game=new Coins();
		break;
	}
	case 2:{
		game=new Stone_Paper();
		break;
	}
	case 3: {
		game=new Hunting();
		break;
	}
	}
	return game;
	}
}
