package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.KeyStroke;

public class MouseControl implements ActionListener {
	
	Main main;

	public MouseControl(Main main) {
		this.main = main;
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		b.setFocusable(false);
		
		if(b.getText().equals("배지")) {
			for(int i =0; i < 5; i++) {
				main.evidence.EvidenceText[i].setVisible(false);
			}
			main.evidence.EvidenceText[0].setVisible(true);
			}	
		if(b.getText().equals("부검")) {
			for(int i =0; i < 5; i++) {
				main.evidence.EvidenceText[i].setVisible(false);
			}
			main.evidence.EvidenceText[1].setVisible(true);
			}
		if(b.getText().equals("장식")) {
			for(int i =0; i < 5; i++) {
				main.evidence.EvidenceText[i].setVisible(false);
			}
			main.evidence.EvidenceText[2].setVisible(true);
			}
		if(b.getText().equals("여권")) {
			for(int i =0; i < 5; i++) {
				main.evidence.EvidenceText[i].setVisible(false);
			}
			main.evidence.EvidenceText[3].setVisible(true);
			}
		if(b.getText().equals("정전")) {
			for(int i =0; i < 5; i++) {
				main.evidence.EvidenceText[i].setVisible(false);
			}
			main.evidence.EvidenceText[4].setVisible(true);
			}
		
		if((b.getText().equals(">>") || b.getText().equals("<<"))) {
			main.sound.effectStart((File)main.sound.click);

			if(Main.index > 0 && Main.index < 24) {
			if(b.getText().equals(">>")) {
				Main.index++;
				main.event1.Event1();
				}
			}
			if(Main.index >= 24 && Main.index < 33) {
				if(b.getText().equals(">>")) {
					Main.index++;
					main.event1.Interrogateevent1.Interrogation1();
				}
			}
			if(Main.index >=26 && Main.index <= 33)
				if(b.getText().equals("<<")) {
					Main.index--;
					main.event1.Interrogateevent1.Interrogation1();
					}	
			
			if(Main.index > 33 && Main.index < 58) {
				if(b.getText().equals(">>")) {
					Main.index++;
					main.event1.Interrogateevent1.event2.Event2();
				}
				}
			if(Main.index >= 58 && Main.index <= 63) {
				if(b.getText().equals(">>")) {
					Main.index++;
					main.event1.Interrogateevent1.event2.Interrogateevent2.Interrogation2();
				}
				}
			if(Main.index >= 60) {
				if(b.getText().equals("<<")) {
					Main.index--;
					main.event1.Interrogateevent1.event2.Interrogateevent2.Interrogation2();
				}
				}
			if(Main.index >= 65 && Main.index <= 80) {
				if(b.getText().equals(">>")) {
					Main.index++;
					main.event1.Interrogateevent1.event2.Interrogateevent2.event3.Event3();
				}
				}
			if(Main.index >= 100) {
				if(b.getText().equals(">>")) {
					Main.index++;
					main.wrong.WrongAns();
					}
				}
			}
	}
}