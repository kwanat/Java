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
		//dopisaæ dodawanie listenerów
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
		if(view.getGamerName().equals("")||view.getGamerSurname().equals("")||(win==0)&&(lost==0)){
			throw new BlankField();
		}
			model.createNewPlayer(type, view.getGamerName(), view.getGamerSurname());
			model.setPointsValues(win, lost);	
			view.setVisiblegameChoosing(model.gamer);
		}catch (BlankField e1){
		}
		}
		
	}
	class BlankField extends Exception{
		
	}

}


