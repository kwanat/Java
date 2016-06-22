package games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class TicTacToe extends JFrame{
	
	private static final long serialVersionUID = 1L;
	Gamer gamer;
	Values values;
		
	private JPanel mainPanel;
	private JButton buttonfields[];
	private JButton exit;

	private JLabel playerScore;
	private JLabel computerScore;
	private JLabel playerReaction;
	private JLabel currentRound;
		
	char pole[] = new char[9];
	char currentPlayer = 'X';	
	int actualRound;
		
	TicTacToe(Gamer player1, Values values){
			
		this.gamer=player1;
		this.values=values;
		this.actualRound=1;	
		this.setTitle("TicTacToe frame");
		this.setLocationRelativeTo(null);
			
		mainPanel=new JPanel();

		MigLayout mainPanelLayout=new MigLayout("","[grow,fill]");
		mainPanel.setLayout(mainPanelLayout);
		
		buttonfields=new JButton[9];
		exit = new JButton("EXIT");
		playerScore= new JLabel("Player 1 score: ");
		computerScore= new JLabel("Player 2 score: ");
		playerReaction= new JLabel("");
		currentRound= new JLabel("Current round: "+Integer.toString(actualRound));
		
		int k=0;
		for(int i=0; i<9; i++)
			buttonfields[i]=new JButton(" ");
			
		for(int i=0; i<3; i++){
			for(int j=0;j<2;j++){
				mainPanel.add(buttonfields[k]);
				k++;
			}
			mainPanel.add(buttonfields[k],"wrap");
			k++;
		}
			
		for(int i=0; i<9; i++)
			pole[i] = ' ';
		
		for(int i=0; i<9; i++){
			buttonfields[i].addActionListener(new ButtonListener());
			buttonfields[i].setSize(100, 100);
		}
		
		mainPanel.add(currentRound,"wrap");
		mainPanel.add(playerScore,"wrap");
		mainPanel.add(computerScore,"wrap");
		mainPanel.add(playerReaction,"wrap 3");
		playerReaction.setVisible(false);
		mainPanel.add(exit);
		exit.addActionListener(new exitButtonActionListener());
			
		this.add(mainPanel);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600,900 );
		setVisible(true);      
	}
	    
	protected void akcjaWPrzycisku(int index){
		if(pole[index] != 'X' && pole[index] != 'O'){	
			pole[index] = currentPlayer;
			buttonfields[index].setText(String.valueOf(currentPlayer));
			checkWiningConditions(currentPlayer);
			if(currentPlayer == 'X')
				currentPlayer = 'O';
			else
				currentPlayer = 'X';
		}
	}

	protected void checkWiningConditions(char currentPlayer) {
		char ct = currentPlayer;
		int pustePola = 0;
		if (actualRound <= values.numberofRounds) {
			if (pole[0] == ct && pole[1] == ct && pole[2] == ct)
				wonRound(ct);
			else if (pole[3] == ct && pole[4] == ct && pole[5] == ct)
				wonRound(ct);
			else if (pole[6] == ct && pole[7] == ct && pole[8] == ct)
				wonRound(ct);
				///////////////////////////////////////////////////////
			else if (pole[0] == ct && pole[3] == ct && pole[6] == ct)
				wonRound(ct);
			else if (pole[1] == ct && pole[4] == ct && pole[7] == ct)
				wonRound(ct);
			else if (pole[2] == ct && pole[5] == ct && pole[8] == ct)
				wonRound(ct);
				/////////////////////////////////////////////////////////
			else if (pole[0] == ct && pole[4] == ct && pole[8] == ct)
				wonRound(ct);
			else if (pole[2] == ct && pole[4] == ct && pole[6] == ct)
				wonRound(ct);
			for (int i = 0; i < 9; i++) {
				if (pole[i] == ' ')
					pustePola++;
			}
			if (pustePola == 0)
				tie();
			}
	}
	private void resetField(){
		for(int i=0; i<9; i++){
			pole[i] = ' ';
			buttonfields[i].setText(" ");
		}
		if(currentPlayer == 'X')
			currentPlayer = 'X';
		else
			currentPlayer = 'O';
	}

	public void dispScore() {
		this.currentRound.setText("Current round: "+Integer.toString(actualRound));
		this.playerScore.setText("Player 1 score: "+Integer.toString(gamer.getScore()));
		this.computerScore.setText("Player 2 score: "+Integer.toString(values.getComputerScore()));
			
	}

		
		protected void tie() {
			actualRound++;
			this.currentRound.setText("Current round: "+Integer.toString(actualRound));
			resetField();
		}
		
		protected void wonRound(char ct) {
			if(ct == 'X'){
				gamer.addPoints(values.getWinValue());
				values.addComputerScore(values.getLostValue());
			}
			else{ 
				gamer.addPoints(values.getLostValue());
				values.addComputerScore(values.getWinValue());
			}
			if(actualRound==values.numberofRounds){
				if(gamer.getScore() > values.getComputerScore())
				{
					playerReaction.setText(gamer.winReaction());
					playerReaction.setVisible(true);
				}			
				else
				{
					playerReaction.setText(gamer.lostReaction());
					playerReaction.setVisible(true);
				}
				dispScore();
				actualRound++;
				resetField();
			}
		else{
			actualRound++;
			resetField();
			dispScore();
		}
		}
		
		
		
		class ButtonListener implements ActionListener{

			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				if(actualRound<=values.numberofRounds){
				Object source = event.getSource();
				for(int i=0;i<9;i++)
				{
					if (source==buttonfields[i])
						akcjaWPrzycisku(i);
				}
				}
				
			
		}
		}
		class exitButtonActionListener implements ActionListener{

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				gamer.Score=0;
				values.computerScore=0;
				dispose();
			}
			
		}
	}




