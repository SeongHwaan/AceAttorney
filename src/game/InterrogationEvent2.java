package game;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class InterrogationEvent2 implements KeyListener {
	Main main;
	ThirdTrialEvent event3;
	
	public InterrogationEvent2 (Main main) {
		this.main = main;
		Interrogation2();
		main.ui.lpane.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Component com = (Component)e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
		main.ui.lpane.addKeyListener(this);
		main.ui.lpane.setFocusable(true);
		main.ui.lpane.requestFocus();
		}
	
	public void Interrogation2() {
		main.ui.pre.setVisible(true);
		main.ui.Text.setForeground(Color.GREEN);
		switch(Main.index) {
		
		case 59:
			main.ui.LawyerPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
			main.ui.Text.setText("사체를 발견했을 때,\n시계 소리가 들려 왔습니다.");
			break;
		case 60:
			main.ui.Text.setText("정각을 알리는 소리 말이죠...\n아마 TV소리라고 생각합니다.");
			break;
		case 61:		
			main.ui.Text.setText("아, 근데 정각 알람 치고는,\n2시간이나 차이가 있었잖습니까?");
			break;
		case 62:		
			main.ui.Text.setText("아마 피해자 분이 비디오를\n보고 있었던 게 아닐까 싶네요.");
			break;
		case 63:		
			main.ui.Text.setText("그 소리를 들어서 2시라고\n착각했던 것 같네요.");
			break;
        case 64:
			main.ui.Text.setText("그렇게 된 겁니다.\n폐를 끼쳐 죄송합니다.");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(main.evidence.EvidencePanel.isVisible() == true && Main.index >=59 && Main.index <= 64) {
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_E) {
			//objecton!
			main.ui.Objection.setVisible(true);
			main.sound.effectStart((File)main.sound.objection);	
			new java.util.Timer().schedule( 
					new java.util.TimerTask() {
			            @Override
			            public void run() {
			            	main.ui.Objection.setVisible(false);
			            	main.evidence.EvidencePanel.setVisible(false);
			    			if(Main.index == 62 && main.evidence.EvidenceText[4].isVisible() == true ) {
			    				Main.index = 65;
			    				event3 = new ThirdTrialEvent(main);
			    				}
			    			else {   //둘 다 실행되는 문제
			    				Main.temp = Main.index;
			    				Main.index = 100;
			    				main.wrong.WrongAns();
			    			}
			            }
			        }, 
			        980 
			);
		}
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
}
