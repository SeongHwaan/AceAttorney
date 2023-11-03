package game;

import java.awt.Graphics;
import java.io.File;
import java.util.Timer;

import javax.sound.sampled.Clip;

public class FirstTrialEvent {
	
	Main main;
	InterrogationEvent1 Interrogateevent1;
	
	public FirstTrialEvent(Main main) {
		this.main = main;
		Event1();
		main.music.musicStart((File)main.music.Trial);
			}
	
	public void Event1() {
		
		switch(Main.index) {
		case 1: 
			main.ui.JudgePanel.setVisible(true);
			main.ui.JudgeLabel[0].setVisible(true);
			main.ui.Text.setText("증인");
			break;
		case 2:
			main.ui.Text.setText("그럼, 즉시 <증언>을\n해 주시길 바랍니다.");
			break;
		case 3:
			main.ui.Text.setText("당신이 사건 당일\n목격한 것을 이야기해 주십시오.");
			break;
        case 4:
			main.ui.JudgePanel.setVisible(false);
			main.ui.WitnessPanel.setVisible(true);
			main.ui.WitnessLabel[1].setVisible(true);
			main.ui.Text.setText("신문 구독을 권유하러 다니던 중에\n한 집에서 남자가 나왔습니다.");
			break;
		case 5:
			main.ui.WitnessLabel[1].setVisible(false);
			main.ui.WitnessLabel[6].setVisible(true);
			main.ui.Text.setText("남자는 당황한 듯 문을 반쯤\n열어둔 채로 사라져 버렸습니다.");
			break;
		case 6:
			main.ui.Text.setText("이상하다고 생각해서 전 그 집을\n살짝 들여다 보았죠.");
			break;
		case 7:
			main.ui.WitnessLabel[6].setVisible(false);
			main.ui.WitnessLabel[7].setVisible(true);
			main.ui.Text.setText("그랬더니, 세상에 어떤 여성이\n죽어 있더군요!");
			break;
		case 8:
			main.ui.Text.setText("전 바로 경찰을 부르려고\n생각했습니다.");
			break;
		case 9:
			main.ui.WitnessLabel[7].setVisible(false);
			main.ui.WitnessLabel[1].setVisible(true);
			main.ui.Text.setText("하지만 그녀의 집 전화가\n불통이라서,");
			break;
		case 10:
			main.ui.Text.setText("근처 공중전화를 이용해\n신고했습니다.");
			break;
		case 11:
			main.ui.Text.setText("시간도 확실히 기억하고 있습니다.\n오후 2시였습니다.");
			break;
		case 12:
			main.ui.Text.setText("도망간 남자는 틀림없이,\n저기에 있는 피고였습니다.");
			break;
		case 13:
			main.ui.WitnessPanel.setVisible(false);
			main.ui.JudgePanel.setVisible(true);
			main.ui.Text.setText("흐음");
			break;
		case 14:
			main.ui.Text.setText("그런데 현장에 있던 전화는\n어째서 불통이었죠?");
			break;
		case 15:
			main.ui.JudgePanel.setVisible(false);
			main.ui.ProPanel.setVisible(true);
			main.ui.ProLabel[1].setVisible(true);
			main.ui.Text.setText("예. 사건이 있었던 시간에\n건물은 정전 중이었습니다.");
			break;
		case 16:
			main.ui.JudgePanel.setVisible(true);
			main.ui.ProPanel.setVisible(false);
			main.ui.Text.setText("하지만 정전 중이라 해도 아마\n전화는 쓸 수 있을 텐데요...?");
			break;
		case 17:
			main.ui.JudgePanel.setVisible(false);
			main.ui.ProPanel.setVisible(true);
			main.ui.ProLabel[1].setVisible(false);
			main.ui.ProLabel[0].setVisible(true);
			main.ui.Text.setText("예, 맞습니다.");
			break;
		case 18:
			main.ui.Text.setText("다만, 기종에 따라서는\n무선전화기를 사용할 수 없습니다.");
			break;
		case 19:
			main.ui.Text.setText("현장에서 증인이 쓰려던 것은\n그런 타입의 무선전화기였습니다.");
			break;
		case 20:
			main.ui.JudgePanel.setVisible(true);
			main.ui.ProPanel.setVisible(false);
			main.ui.Text.setText("그렇군요.");
			break;
		case 21:
			main.ui.Text.setText("그럼, 변호인.");
			break;
		case 22:
			main.ui.JudgePanel.setVisible(false);
			main.ui.LawyerPanel.setVisible(true);
			main.ui.LawyerLabel[0].setVisible(true);
			main.ui.Text.setText("...아, 예!");
			break;
		case 23:
			main.ui.JudgePanel.setVisible(true);
			main.ui.LawyerPanel.setVisible(false);
			main.ui.Text.setText("<심문>을 부탁드리죠.");
			break;
		case 24:
			main.music.stop((Clip)main.music.clip);
			Interrogateevent1 = new InterrogationEvent1(main);
		}
	}
}

