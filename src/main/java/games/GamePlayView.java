package games;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class GamePlayView extends JFrame{
	private JPanel mainPanel;
	
	private JButton option1;
	private JButton option2;
	private JButton option3;
	
	private JLabel headerText;
	private JLabel score;

	
	public GamePlayView(){
		this.setTitle("Game selecting frame");
		this.setLocationRelativeTo(null);
		//pozosta³e funkcyje konstruktora;
		elementsConfiguration();
		layoutConfiguration();
		addElementsToPanel();
		
		this.add(mainPanel);
		this.pack();
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	private void elementsConfiguration(){
		mainPanel=new JPanel();
		
		headerText=new JLabel("Make your choice: ");
		
		option1=new JButton("option1");
		option2=new JButton("option2");
		option3=new JButton("option3");
		
		
		
	}
	
	private void layoutConfiguration(){
		MigLayout mainPanelLayout=new MigLayout("","[grow,fill]");
		mainPanel.setLayout(mainPanelLayout);
	}
	
	private void addElementsToPanel(){
		mainPanel.add(headerText,"wrap");
		mainPanel.add(option1);
		mainPanel.add(option2);
		mainPanel.add(option3);
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
	
}
