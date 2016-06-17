package games;

public class Schoolboy extends Gamer {

	public Schoolboy(String name, String surname) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.surname=surname;
		this.Score=0;
	}

	public String winReaction() {
		// TODO Auto-generated method stub
		return "Yes, who's the best?";
	}

	public String lostReaction() {
		// TODO Auto-generated method stub
		return "Oh no. You're stupid";
	}

}
