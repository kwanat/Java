package games;

public class Preschooler extends Gamer {

	public Preschooler(String name, String surname) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.surname=surname;
		this.Score=0;
	}

	public String winReaction() {
		// TODO Auto-generated method stub
		return "Yaaaay, I'm better than you";
	}

	public String lostReaction() {
		// TODO Auto-generated method stub
		return "Bleee, I lost again";
	}

}
