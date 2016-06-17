package games;

public class GamerFactory {
	//implements factory design pattern
	public Gamer createGamer(int type, String name, String surname){
		Gamer gamer=null;
		switch(type){
		case 1: {
			gamer=new Preschooler(name,surname);
			break;
		}
		case 2: {
			gamer=new Schoolboy(name,surname);
			break;
		}
		case 3: {
			gamer=new Student(name,surname);
			break;
		}
		
		}
		return gamer;
	}
}
