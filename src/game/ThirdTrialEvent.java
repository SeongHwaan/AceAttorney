package game;

import java.awt.Color;
import java.io.File;

import javax.sound.sampled.Clip;

public class ThirdTrialEvent {
	Main main;
	
	public ThirdTrialEvent(Main main) {
		this.main = main;
		Event3();
			}
	
	public void Event3() {
		main.ui.pre.setVisible(false);
		main.ui.Text.setForeground(Color.WHITE);
		
		switch(Main.index) {
		case 65:
			main.music.stop((Clip)main.music.clip);
			for(int i = 0; i<6; i++) {
			main.ui.LawyerLabel[i].setVisible(false);
			}
			main.ui.LawyerLabel[2].setVisible(true);
			main.ui.WitnessPanel.setVisible(false);
			main.ui.LawyerPanel.setVisible(true);
			main.ui.Text.setText("잠깐만요!");
			break;
		case 66:
			main.ui.Text.setText("애초에 아파트 전체가\n정전이었을 겁니다.");
			break;
		case 67:
			main.ui.LawyerLabel[2].setVisible(false);
			main.ui.LawyerLabel[3].setVisible(true);
			main.ui.Text.setText("이 기록이 그것을 증명하고 있습니다.");
			break;
		case 68:
			main.sound.effectStart((File)main.sound.wow);
			main.ui.WitnessLabel[1].setVisible(false);
			main.ui.WitnessLabel[4].setVisible(true);
			main.ui.LawyerPanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
			main.ui.Text.setText("...!");
			break;
		case 69:
			main.music.musicStart((File)main.music.Pursuit);
			main.ui.LawyerLabel[3].setVisible(false);
			main.ui.LawyerLabel[5].setVisible(true);
			main.ui.WitnessPanel.setVisible(false);
			main.ui.LawyerPanel.setVisible(true);
			main.ui.Text.setText("TV든 비디오든 간에\n볼 수 있을 리가 없잖습니까!");
			break;
		case 70:
			main.sound.effectStart((File)main.sound.surprise);
			main.ui.LawyerPanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
			main.ui.Text.setText("...!!");
			break;
		case 71:
			main.ui.Text.setText("...그, 그건...");
			break;
		case 72:
			main.ui.JudgeLabel[0].setVisible(false);
			main.ui.JudgeLabel[1].setVisible(true);
			main.ui.WitnessPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(true);
			main.ui.Text.setText("...정말 그렇군요.");
			break;
		case 73:
			main.ui.Text.setText("증인.\n...어떻게 된 거죠?");
			break;
		case 74:
			main.ui.WitnessLabel[4].setVisible(false);
			main.ui.WitnessLabel[5].setVisible(true);
			main.ui.JudgePanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
			main.ui.Text.setText("...아니 저도 저기,\n어떻게 된 일인지...");
			break;
		case 75:
			main.ui.WitnessPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(true);
			main.ui.Text.setText("증인.");
			break;
		case 76:
			main.ui.Text.setText("점점 당신이라는 인물이\n수상하게 보이는군요.");
			break;
		case 77:
			main.ui.Text.setText("뭐랄까, 수상쩍게 안절부절\n하는 모습도 그렇구요.");
			break;
		case 78:
			main.sound.effectStart((File)main.sound.surprise);
			main.ui.WitnessLabel[5].setVisible(false);
			main.ui.WitnessLabel[4].setVisible(true);
			main.ui.JudgePanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
			main.ui.Text.setText("...!!!");
			break;
			
			}
		}
	}