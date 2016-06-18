package games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class GameSelectController {
	private GameSelectView view;
	private GameSelectModel model;
	
	public GameSelectController(GameSelectView view, GameSelectModel model){
		this.model=model;
		this.view=view;
		
		view.addSubmitButtonListener(new submitButtonListener());
		view.addCoinButtonListener(new CoinsButtonListener());
		view.addCirclesButtonListener(new CirclesButtonListener());
		view.addHuntingButtonListener(new HuntingButtonListener());
		view.addStonesButtonListener(new StonesButtonListener());
	}
	
	
	class submitButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		int type;
		if(view.isSelectedPreschoolerOption())
			type=1;
		else if(view.isSelectedSchoolboyOption())
			type=2;
		else
			type=3;
		int win=view.getWinValue();
		int lost=view.getLostValue();
		
		try{
		if(view.getGamerName().equals("")||view.getGamerSurname().equals("")||(view.getnumofRValue()==0)){
			throw new BlankField();
		}
			model.createNewPlayer(type, view.getGamerName(), view.getGamerSurname());
			model.setPointsValues(win, lost,view.getnumofRValue());	
			view.setVisiblegameChoosing(model.gamer);
		}catch (BlankField e1){
		}
		}
		
	}
	class BlankField extends Exception{
		
	}
	
	class CoinsButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			model.createNewGame(1);
			GamePlayView gameView=new GamePlayView();
			GamePlayModel gameModel=new GamePlayModel(model.gamer,model.game,model.values);
			GamePlayController gameController=new GamePlayController(gameView,gameModel);
		}
		
	}
	
	class HuntingButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			model.createNewGame(3);
			GamePlayView gameView=new GamePlayView();
			GamePlayModel gameModel=new GamePlayModel(model.gamer,model.game,model.values);
			GamePlayController gameController=new GamePlayController(gameView,gameModel);
		}
		
	}
	
	class StonesButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			model.createNewGame(2);
			GamePlayView gameView=new GamePlayView();
			GamePlayModel gameModel=new GamePlayModel(model.gamer,model.game,model.values);
			GamePlayController gameController=new GamePlayController(gameView,gameModel);
		}
		
	}
	
	class CirclesButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("jeszcze nie gotowe");
		}
		
	}

}


