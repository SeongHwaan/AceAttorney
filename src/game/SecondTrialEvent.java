package game;

import java.awt.Color;
import java.io.File;

import javax.sound.sampled.Clip;

public class SecondTrialEvent {
	Main main;
	InterrogationEvent2 Interrogateevent2;
	
	public SecondTrialEvent(Main main) {
		this.main = main;
		Event2();
		main.music.stop((Clip)main.music.clip);
			}
	
	public void Event2() {
		main.ui.pre.setVisible(false);
		main.ui.Text.setForeground(Color.WHITE);
		
		switch(Main.index) {
		case 34: 
			main.ui.LawyerLabel[4].setVisible(false);
			main.ui.LawyerLabel[0].setVisible(true);
			main.ui.WitnessPanel.setVisible(false);
			main.ui.LawyerPanel.setVisible(true);
			main.ui.Text.setText("사체를 발견한 것이 2시.\n틀림없습니까?");
			break;
		case 35:
			main.ui.WitnessPanel.setVisible(true);
			main.ui.LawyerPanel.setVisible(false);
			main.ui.Text.setText("네.\n2시였습니다. 분명히.");
			break;
		case 36:		
			main.ui.WitnessPanel.setVisible(false);
			main.ui.LawyerPanel.setVisible(true);
			main.ui.LawyerLabel[0].setVisible(false);
			main.ui.LawyerLabel[2].setVisible(true);
			main.ui.Text.setText("하지만 그건 좀 이상하군요.");
			break;
        case 37:
        	main.music.musicStart((File)main.music.Correct);
			main.ui.LawyerLabel[2].setVisible(false);
			main.ui.LawyerLabel[3].setVisible(true);
			main.ui.Text.setText("해부 기록 데이터와\n명백히 모순됩니다.");
			break;
		case 38:
			main.ui.Text.setText("피해자가 사망한 것은\n오후 4시 이후입니다.");
			break;
		case 39:
			main.ui.Text.setText("2시에 사체를 발견한다는\n일은 있을 수 없습니다!");
			break;
		case 40:	
			main.ui.Text.setText("어째서 2시간이나\n차이가 나는 거죠...?");
			break;
        case 41:
        	main.ui.LawyerPanel.setVisible(false);
        	main.ui.WitnessPanel.setVisible(true);
        	main.ui.WitnessLabel[1].setVisible(false);
        	main.ui.WitnessLabel[2].setVisible(true);
			main.ui.Text.setText("....!");
			break;
		case 42:
			Main.index++;
		case 43:
			main.ui.WitnessPanel.setVisible(false);
			main.ui.ProPanel.setVisible(true);
			main.ui.ProLabel[0].setVisible(false);
			main.ui.ProLabel[3].setVisible(true);
			main.ui.Text.setText("그건 사소한 일입니다.\n단순한 착오로서...");
			break;
		case 44:
			main.ui.ProPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(true);
			main.ui.JudgeLabel[0].setVisible(false);
			main.ui.JudgeLabel[1].setVisible(true);
			main.ui.Text.setText("...저는 그렇게 생각 않습니다.");
			break;
		case 45:		
			main.ui.Text.setText("증인.");
			break;
        case 46:
			main.ui.Text.setText("어째서 사체를 발견한 시간을\n2시라고 말했죠?");
			break;
		case 47:
			main.ui.JudgePanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
        	main.ui.WitnessLabel[2].setVisible(false);
        	main.ui.WitnessLabel[3].setVisible(true);
			main.ui.Text.setText("...어, 그러니까...저기,\n어, 어째서일까요...");
			break;
		case 48:
			main.music.stop((Clip)main.music.clip);
			main.sound.effectStart((File)main.sound.wow);
			main.ui.WitnessLabel[3].setVisible(false);
			main.ui.WitnessLabel[0].setVisible(true);
			main.ui.Text.setText("...앗\n맞아, 생각났습니다!");
			break;
		case 49:
			main.ui.WitnessPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(true);
			main.ui.Text.setText("...그럼, 다시 한번 <증언>\n해 주시겠습니까?");
			break;
		case 50:
			main.music.musicStart((File)main.music.Questioning);
			main.ui.JudgePanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
			main.ui.WitnessLabel[0].setVisible(false);
			main.ui.WitnessLabel[1].setVisible(true);
			main.ui.Text.setText("사체를 발견했을 때,\n시계 소리가 들려 왔습니다.");
			break;
		case 51:
			main.ui.Text.setText("정각을 알리는 소리 말이죠...\n아마 TV소리라고 생각합니다.");
			break;
		case 52:		
			main.ui.Text.setText("아, 근데 정각 알람 치고는,\n2시간이나 차이가 있었잖습니까?");
			break;
		case 53:		
			main.ui.Text.setText("아마 피해자 분이 비디오를\n보고 있었던 게 아닐까 싶네요.");
			break;
		case 54:		
			main.ui.Text.setText("그 소리를 들어서 2시라고\n착각했던 것 같네요.");
			break;
        case 55:
			main.ui.Text.setText("그렇게 된 겁니다.\n폐를 끼쳐 죄송합니다.");
			break;
		case 56:
			main.ui.WitnessPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(true);
			main.ui.JudgeLabel[1].setVisible(false);
			main.ui.JudgeLabel[0].setVisible(true);
			main.ui.Text.setText("...흠. 그랬었군요.\n비디오로 알람을 들었다...");
			break;
		case 57:
			main.ui.Text.setText("그럼 변호인.\n<심문>을 부탁합니다.");
			break;
		case 58:
			Interrogateevent2 = new InterrogationEvent2(main);
		}

	}
	
}