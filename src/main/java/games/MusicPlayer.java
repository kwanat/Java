package games;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class MusicPlayer {
//this class implements Singleton design pattern
	//tutorialspoint.com
	private static MusicPlayer instance=null;
	private MusicPlayer() {}
	public static MusicPlayer getInstance(){
		if (instance==null)
			instance=new MusicPlayer();
		return instance;
	}
	public void playMusic() throws Exception{
		File soundFile=new File("sound/abc.wav");
		AudioInputStream audioinput=AudioSystem.getAudioInputStream(soundFile);
		
		Clip clip=AudioSystem.getClip();
		clip.open(audioinput);
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		
	}
}
