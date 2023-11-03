package game;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
	Main main;
	File Trial = new File("src/music/Trial.wav");
	File Questioning = new File("src/music/Questioning.wav");
	File Correct = new File("src/music/Correct.wav");
	File Pursuit = new File("src/music/Pursuit.wav");
	
	Clip clip;
	
	public Music(Main main) {
		this.main = main;
	}
	
	public void musicStart(File file) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}
		catch(Exception e){
		}	
	}
	
	public void stop(Clip clip) {
		clip.stop();
	}
}
	
