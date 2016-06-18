package games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePlayController {
	GamePlayView view;
	GamePlayModel model;
	
	public GamePlayController(GamePlayView view, GamePlayModel model){
		this.model=model;
		this.view=view;
	
		this.view.prepareView(this.model.game.getfirstOption(), this.model.game.getsecoundOption(), this.model.game.getthirdOption());
	
		this.view.addOption1ButtonListener(new Option1ActionListener());
		this.view.addOption2ButtonListener(new Option2ActionListener());
		this.view.addOption3ButtonListener(new Option3ActionListener());
	}
	
	
	class Option1ActionListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(model.currentRound<=model.values.numberofRounds){
				model.game.nextRound(1, model.gamer, model.values);
				model.currentRound++;
			}
			else{
				//tu trza jakoœ gre zakoñczyæ
				System.out.println("koniec gry");
				System.out.println(model.gamer.winReaction());
				view.dispose();
			}
		}
		
	}
	
	class Option2ActionListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(model.currentRound<=model.values.numberofRounds){
				model.game.nextRound(2, model.gamer, model.values);
				model.currentRound++;
			}
			else{
				//tu trza jakoœ gre zakoñczyæ
				System.out.println("koniec gry");
				System.out.println(model.gamer.winReaction());
			}
		}
		
	}
	
	class Option3ActionListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(model.currentRound<=model.values.numberofRounds){
				model.game.nextRound(3, model.gamer, model.values);
				model.currentRound++;
			}
			else{
				//tu trza jakoœ gre zakoñczyæ
				System.out.println("koniec gry");
				System.out.println(model.gamer.winReaction());
			}
		}
		
	}

}
