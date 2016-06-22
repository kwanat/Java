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
		this.view.addOption2ButtonListener(new Option1ActionListener());
		this.view.addOption3ButtonListener(new Option1ActionListener());
		this.view.addExitButtonListener(new exitButtonActionListener());
	}
	
	
	class Option1ActionListener implements ActionListener{

		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			Object source=event.getSource();
			
			if(model.currentRound<=model.values.numberofRounds){
				if(source==view.option1){
					model.game.nextRound(1, model.gamer, model.values);
					view.setNewValues(model.currentRound, model.game.getPlayerChoice(1), model.game.getComputerChoice(), model.gamer.Score, model.values.computerScore);
				}
				else if(source==view.option2){
					model.game.nextRound(2, model.gamer, model.values);
					view.setNewValues(model.currentRound, model.game.getPlayerChoice(2), model.game.getComputerChoice(), model.gamer.Score, model.values.computerScore);
				}
				else{
					model.game.nextRound(3, model.gamer, model.values);
					view.setNewValues(model.currentRound, model.game.getPlayerChoice(3), model.game.getComputerChoice(), model.gamer.Score, model.values.computerScore);
				}
				
				model.currentRound++;
				if(model.currentRound==model.values.numberofRounds+1){
					//zakoñczenie gry
					view.setPlayerReaction(model.getPlayerReaction(model.getWinner()));
					view.showPlayerReaction();
					model.clearScore();
				}
			}
			
		}
		
		
	}
	
	class exitButtonActionListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			view.dispose();
		}
		
	}

}
