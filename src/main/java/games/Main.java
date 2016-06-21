package games;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		MusicPlayer player = MusicPlayer.getInstance();
		try {
			player.playMusic();
	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GameSelectView firstview= new GameSelectView(); 
		GameSelectModel firstmodel= new GameSelectModel();
		GameSelectController controller = new GameSelectController(firstview,firstmodel);

	}

}
