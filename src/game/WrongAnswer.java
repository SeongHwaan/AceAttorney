package game;

import java.awt.Color;

public class WrongAnswer {
	
	Main main;
	
	public WrongAnswer(Main main) {
		this.main = main;
			}
	
	public void WrongAns() {
		main.ui.pre.setVisible(false);
		main.ui.Text.setForeground(Color.WHITE);
		for(int i = 0; i<6; i++) {
			main.ui.LawyerLabel[i].setVisible(false);
		}
		for(int i = 0; i<4; i++) {
			main.ui.JudgeLabel[i].setVisible(false);
		}
		main.ui.LawyerLabel[0].setVisible(true);
		main.ui.JudgeLabel[0].setVisible(true);
		
		switch(Main.index) {
		case 100: 
			main.ui.WitnessPanel.setVisible(false);
			main.ui.LawyerPanel.setVisible(true);
			main.ui.Text.setText("이 증거품은 지금 증언의\n모순을 확실히 증명하고 있습니다!");
			break;
		case 101:
			main.ui.LawyerPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(true);
			main.ui.Text.setText("......그 증거품과 지금 증언이\n어떤 관계가 있다는 겁니까?");
			break;
		case 102:		
			main.ui.LawyerLabel[0].setVisible(false);
			main.ui.LawyerLabel[1].setVisible(true);
			main.ui.JudgePanel.setVisible(false);
			main.ui.LawyerPanel.setVisible(true);
			main.ui.Text.setText("......관계 없나요, 역시.");
			break;
        case 103:
			main.ui.JudgeLabel[0].setVisible(false);
			main.ui.JudgeLabel[1].setVisible(true);
        	main.ui.LawyerPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(true);
			main.ui.Text.setText("전혀 없습니다.");
			break;
		case 104:
			main.ui.JudgeLabel[0].setVisible(false);
			main.ui.JudgeLabel[1].setVisible(true);
			main.ui.Text.setText("변호인. 더 신중히\n생각한 후에 발언하시길.");
			break;
		case 105:
			main.ui.LawyerLabel[0].setVisible(false);
			main.ui.LawyerLabel[1].setVisible(false);
			main.ui.LawyerLabel[4].setVisible(true);
			main.ui.JudgePanel.setVisible(false);
			main.ui.LawyerPanel.setVisible(true);
			main.ui.Text.setText("(......다시 생각해봐야겠다......)");
			break;
		case 106:
			if(Main.temp >= 25 && Main.temp <= 33 ) {
			Main.index = 25;
			main.event1.Interrogateevent1.Interrogation1();
			}
		case 107:
			if(Main.temp >= 59 && Main.temp <= 64 ) {
				Main.index = 59;
				main.event1.Interrogateevent1.event2.Interrogateevent2.Interrogation2();
			}
		}
	}
}
