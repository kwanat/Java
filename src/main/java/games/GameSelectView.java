package games;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


import net.miginfocom.swing.MigLayout;

public class GameSelectView extends JFrame {
	
	private JPanel mainPanel;

	
	private JLabel headerText;
	private JLabel name;
	private JLabel surname;
	private JLabel type;
	private JLabel selectGame;
	private JLabel selectValues;
	private JLabel winValue;
	private JLabel lostValue;
	private JLabel rounds;

	
	private ButtonGroup playerType;

	private JRadioButton preschooler;
	private JRadioButton schoolboy;
	private JRadioButton student;

	private JTextField playerName;
	private JTextField playerSurname;
	private JTextField winValueText;
	private JTextField lostValueText;
	private JTextField numofRounds;

	private JButton submit;
	private JButton coins;
	private JButton stones;
	private JButton hunting;
	private JButton circles;
	
	
	public GameSelectView(){
		this.setTitle("Game selecting frame");
		this.setLocationRelativeTo(null);
		//pozosta³e funkcyje konstruktora;
		elementsConfiguration();
		layoutConfoguration();
		addElementsToPanel();
		
		this.add(mainPanel);
	
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void elementsConfiguration(){
		mainPanel=new JPanel();
		
		
		headerText=new JLabel("Write your personal data");
		name=new JLabel("Name:");
		surname=new JLabel("Surname:");
		type=new JLabel("Type: ");
		selectGame=new JLabel("Select game to play");
		selectValues= new JLabel("Select win/lost values");
		winValue = new JLabel("Win value:");
		lostValue= new JLabel("Lost value");
		rounds=new JLabel("Choose number of rounds:");
	
		
		playerType=new ButtonGroup();
		
		preschooler=new JRadioButton("Preschooler");
		preschooler.setSelected(true);
		schoolboy=new JRadioButton("Schoolboy");
		student=new JRadioButton("Student");
		
		playerName=new JTextField(10);
		playerSurname=new JTextField(10);
		winValueText=new JTextField(4);
		lostValueText= new JTextField(4);
		numofRounds= new JTextField(2);
		
		submit= new JButton("SUBMIT");
		coins = new JButton("COINS");
		stones= new JButton("ROSHAMBO");
		hunting=new JButton("DEER HUNTING");
		circles=new JButton("NOUGHTS AND CROSSES");
		
	}
	
	private void layoutConfoguration(){
		MigLayout mainPanelLayout=new MigLayout("","[grow,fill]");
		mainPanel.setLayout(mainPanelLayout);
		
	}
	
	private void addElementsToPanel(){
		mainPanel.add(headerText,"wrap");
		mainPanel.add(name, "split 2");
		mainPanel.add(playerName);
		mainPanel.add(surname, "split 2");
		mainPanel.add(playerSurname,"wrap");
		mainPanel.add(selectValues,"span 2");
		mainPanel.add(rounds,"wrap");
		mainPanel.add(winValue,"split 2");
		mainPanel.add(winValueText);
		mainPanel.add(numofRounds,"wrap");
		mainPanel.add(lostValue,"split 2");
		mainPanel.add(lostValueText,"wrap");
		mainPanel.add(type,"wrap");
		
		playerType.add(preschooler);
		playerType.add(schoolboy);
		playerType.add(student);
		
		mainPanel.add(preschooler,"wrap");
		mainPanel.add(schoolboy,"wrap");
		mainPanel.add(student,"wrap");
		
		mainPanel.add(submit,"span");
		mainPanel.add(selectGame,"wrap");
		mainPanel.add(circles);
		mainPanel.add(coins);
		mainPanel.add(stones);
		mainPanel.add(hunting,"wrap");
		
		
		
		
		selectGame.setVisible(false);
		circles.setVisible(false);
		coins.setVisible(false);
		stones.setVisible(false);
		hunting.setVisible(false);
	}
	
	public void setVisiblegameChoosing(Gamer gamer){
		selectGame.setVisible(true);
		circles.setVisible(true);
		coins.setVisible(true);
		stones.setVisible(false);
		hunting.setVisible(false);
		if(gamer instanceof Schoolboy)
			stones.setVisible(true);
			hunting.setVisible(false);
		if(gamer instanceof Student){
			stones.setVisible(true);
			hunting.setVisible(true);
		}
	
	}
	
	String getGamerName(){
		return playerName.getText();
	}
	
	String getGamerSurname(){
		return playerSurname.getText();
	}
	int getWinValue(){
		Integer parsedNumber = null;
        try{
        	parsedNumber = Integer.parseInt(winValueText.getText());
        	return parsedNumber;
        } catch (Exception exp) {
			return 1;
		}
        
	}
	int getLostValue(){
		Integer parsedNumber = null;
		try{
        	parsedNumber = Integer.parseInt(lostValueText.getText());
        	return parsedNumber;
		} catch (Exception exp) {
			return -1;
		}
	}
	int getnumofRValue(){
		Integer parsedNumber = null;
		try{
        	parsedNumber = Integer.parseInt(numofRounds.getText());
        	return parsedNumber;
		} catch (Exception exp) {
			return 0;
		}
	}
	
	void addSubmitButtonListener(ActionListener listener){
		submit.addActionListener(listener);
	}
	
	void addCoinButtonListener(ActionListener listener){
		coins.addActionListener(listener);
	}
	void addHuntingButtonListener(ActionListener listener){
		hunting.addActionListener(listener);
	}
	void addCirclesButtonListener(ActionListener listener){
		circles.addActionListener(listener);
	}
	void addStonesButtonListener(ActionListener listener){
		stones.addActionListener(listener);
	}
	
	boolean isSelectedPreschoolerOption(){
		return preschooler.isSelected();
	}
	
	boolean isSelectedSchoolboyOption(){
		return schoolboy.isSelected();
	}
	
	boolean isSelectedStudentOption(){
		return student.isSelected();
	}
	
	


}
