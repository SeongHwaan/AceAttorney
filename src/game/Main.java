package game;

public class Main {
	
	public static int index = 1;
	public static int temp;
	UI ui = new UI(this);
	Evidence evidence = new Evidence(this);
	Music music = new Music(this);
	SoundEffect sound = new SoundEffect(this);
	FirstTrialEvent event1 = new FirstTrialEvent(this);
	WrongAnswer wrong = new WrongAnswer(this);
	MouseControl control = new MouseControl(this);
	KeyControl key = new KeyControl((this));

	public Main() {}
	
    public static void main(String[] args) {
		new Main();
    }
}


