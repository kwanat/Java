package games;

public abstract class Gamer implements endReaction {
	String name;
	String surname;
	int Score;
	
	public void addPoints(int value){
		this.Score+=value;
	}
	public int getScore(){
		return this.Score;
	}
	public String getName(){
		return this.name;
	}
	public String getSurame(){
		return this.surname;
	}
}
