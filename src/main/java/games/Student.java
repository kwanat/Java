package games;

public class Student extends Gamer{

	public Student(String name, String surname) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.surname=surname;
		this.Score=0;
	}

	public String winReaction() {
		// TODO Auto-generated method stub
		return "I'm the best";
	}

	public String lostReaction() {
		// TODO Auto-generated method stub
		return "What the ****?";
	}

}
