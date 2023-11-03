package game;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.Timer;

public class InterrogationEvent1 implements KeyListener {
	Main main;
	SecondTrialEvent event2;
	public InterrogationEvent1 (Main main) {
		this.main = main;
		Interrogation1();
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
		main.music.musicStart((File)main.music.Questioning);
	}
	
	public void Interrogation1() {
		main.ui.pre.setVisible(true);
		main.ui.Text.setForeground(Color.GREEN);
		switch(Main.index) {
		case 25:
			main.ui.LawyerPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
			main.ui.Text.setText("신문 구독을 권유하러 다니던 중에\n한 집에서 남자가 나왔습니다.");
			break;
		case 26:
			main.ui.Text.setText("남자는 당황한 듯 문을 반쯤\n열어둔 채로 사라져 버렸습니다.");
			break;
		case 27:
			main.ui.Text.setText("이상하다고 생각해서 전 그 집을\n살짝 들여다 보았죠.");
			break;
		case 28:
			main.ui.Text.setText("그랬더니, 세상에 어떤 여성이\n죽어 있더군요!");
			break;
		case 29:
			main.ui.Text.setText("전 바로 경찰을 부르려고\n생각했습니다.");
			break;
		case 30:
			main.ui.Text.setText("하지만 그녀의 집 전화가\n불통이라서,");
			break;
		case 31:
			main.ui.Text.setText("근처 공중전화를 이용해\n신고했습니다.");
			break;
		case 32:
			main.ui.Text.setText("시간도 확실히 기억하고 있습니다.\n오후 2시였습니다.");
			break;
		case 33:
			main.ui.Text.setText("도망간 남자는 틀림없이,\n저기에 있는 피고였습니다.");
			break;
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(main.evidence.EvidencePanel.isVisible() == true && Main.index >=25 && Main.index <= 33) {
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
			    			if(Main.index == 32 && main.evidence.EvidenceText[1].isVisible() == true ) {
			    				Main.index = 34;
			    				event2 = new SecondTrialEvent(main);
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


