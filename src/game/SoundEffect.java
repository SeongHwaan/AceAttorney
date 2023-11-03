package game;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundEffect {
	Main main;
	File objection = new File("src/music/objectLawyer.wav");
	File wow = new File("src/music/Wow.wav");
	File popup = new File("src/music/popup.wav");
	File close = new File("src/music/close.wav");
	File surprise = new File("src/music/surprise.wav");
	File click = new File("src/music/Click.wav");
	
	
	Clip clip2;
	
	public SoundEffect(Main main) {
		this.main = main;
	}
	
	public void effectStart(File file) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
			clip2 = AudioSystem.getClip();
			clip2.open(audioInputStream);
			clip2.start();
		}
		catch(Exception e){
		}	
		}
	
	public void stop(Clip clip) {
		clip.stop();
	}
	}
	
