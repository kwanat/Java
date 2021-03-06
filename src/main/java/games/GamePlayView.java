package games;

import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class GamePlayView extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JPanel mainPanel;
	
	
	public JButton option1;
	public JButton option2;
	public JButton option3;
	private JButton exitButton;
	
	private JLabel headerText;
//	private JLabel score;
	private JLabel playerScore;
	private JLabel computerScore;
	private JLabel playerReaction;
	private JLabel currentRound;
	private JLabel playerChoice;
	private JLabel computerChoice;
	

	
	public GamePlayView(){
		this.setTitle("Game selecting frame");
		this.setLocationRelativeTo(null);
		
		elementsConfiguration();
		layoutConfiguration();
		addElementsToPanel();
	
		this.add(mainPanel);
	
		this.setSize(350, 300);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	private void elementsConfiguration(){
		mainPanel=new JPanel();
		
		
		headerText=new JLabel("Make your choice: ");
		playerScore= new JLabel("Player Score: ");
		computerScore= new JLabel("Computer Score");
		playerReaction= new JLabel("sadgfasd");
		playerChoice = new JLabel("Player Choice");
		computerChoice = new JLabel("Computer Choice");
		currentRound = new JLabel("Current Round");
		
		option1=new JButton("option1");
		option2=new JButton("option2");
		option3=new JButton("option3");
		exitButton=new JButton("EXIT");
		
		
	}
	
	private void layoutConfiguration(){
		MigLayout mainPanelLayout=new MigLayout("","[grow,fill]");
		mainPanel.setLayout(mainPanelLayout);
	
	}
	
	private void addElementsToPanel(){
		mainPanel.add(headerText,"wrap");
		mainPanel.add(option1);
		mainPanel.add(option2);
		mainPanel.add(option3,"wrap");
		mainPanel.add(exitButton,"span");
		mainPanel.add(currentRound,"wrap");
		mainPanel.add(playerChoice,"wrap");
		mainPanel.add(computerChoice,"wrap");
		mainPanel.add(playerScore,"wrap");
		mainPanel.add(computerScore,"wrap");
		
		mainPanel.add(playerReaction,"wrap");
	}
	
	public void prepareView(String firstOption, String secoundOption, String thirdOption){
		if(thirdOption==null){
			option1.setText(firstOption);
			option2.setText(secoundOption);
			option3.setVisible(false);
		}
		else{
			option1.setText(firstOption);
			option2.setText(secoundOption);
			option3.setText(thirdOption);
		}
		playerReaction.setVisible(false);
	}
	void addOption1ButtonListener(ActionListener listener){
		option1.addActionListener(listener);
	}
	void addOption2ButtonListener(ActionListener listener){
		option2.addActionListener(listener);
	}
	void addOption3ButtonListener(ActionListener listener){
		option3.addActionListener(listener);
	}
	
	void addExitButtonListener(ActionListener listener){
		exitButton.addActionListener(listener);
	}
	
	public void showPlayerReaction(){
		this.playerReaction.setVisible(true);
		//this.endPanel.setVisible(true);
	}
	public void setNewValues(int round, String players, String computers, int pScore, int cScore){
		
		playerScore.setText("Player Score: "+Integer.toString(pScore));
		computerScore.setText("Computer Score: "+Integer.toString(cScore));
		playerChoice.setText("Player Choice: "+players);
		computerChoice.setText("Computer Choice: "+computers);
		currentRound.setText("Current Round: "+Integer.toString(round));
	}
	
	public void setPlayerReaction(String reaction){
		this.playerReaction.setText(reaction);
	}
	
	

}
