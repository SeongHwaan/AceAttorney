package game;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class UI {

	Main main;
	public JFrame frame;
	public JLayeredPane lpane = new JLayeredPane();
	public JPanel SettingPanel = new JPanel();
	public JPanel LawyerPanel = new JPanel();
	public JPanel ProPanel = new JPanel();
	public JPanel JudgePanel = new JPanel();
	public JPanel WitnessPanel = new JPanel();
	public JLabel BackLabel[] = new JLabel[4];
	public JLabel LawyerLabel[] = new JLabel[6];
	public JLabel ProLabel[] = new JLabel[5];
	public JLabel JudgeLabel[] = new JLabel[4];
	public JLabel WitnessLabel[] = new JLabel[8];
	public JLabel TextAreaLabel = new JLabel();
	public JTextArea Text = new JTextArea();
	public JButton next;
	public JButton pre;
	public JPanel Objection = new JPanel();
	public JLabel ObjectLabel = new JLabel();
	
	//Background
	private ImageIcon Back1 = new ImageIcon("src/images/BackgroundLawyer.jpg");
	private ImageIcon Back2 = new ImageIcon("src/images/BackgroundPro.jpg");
    private ImageIcon Back3 = new ImageIcon("src/images/BackgroundJudge.png");
    private ImageIcon Back4 = new ImageIcon("src/images/BackgroundWitness.png");
    //setting
    private ImageIcon icon = new ImageIcon("src/images/ButtonUI.png");
    private ImageIcon objection = new ImageIcon("src/images/Objection.gif");
    private ImageIcon icon3 = new ImageIcon("src/images/TextAreaUI.png");
    //Lawyer
    private ImageIcon LMotion1 = new ImageIcon("src/images/LStop.gif");
    private ImageIcon LMotion2 = new ImageIcon("src/images/Lembarrassed.gif");
    private ImageIcon LMotion3 = new ImageIcon("src/images/LSmashed.gif");
    private ImageIcon LMotion4 = new ImageIcon("src/images/LReading.gif");
    private ImageIcon LMotion5 = new ImageIcon("src/images/Lembrrassed2.gif");
    private ImageIcon LMotion6 = new ImageIcon("src/images/LPointed.gif");
    //Prosecutor
    private ImageIcon PMotion1 = new ImageIcon("src/images/PTalking.gif");
    private ImageIcon PMotion2 = new ImageIcon("src/images/PNormal.gif");
    private ImageIcon PMotion3 = new ImageIcon("src/images/PSweat.gif");
    private ImageIcon PMotion4 = new ImageIcon("src/images/PSweatTalking.gif");
    private ImageIcon PMotion5 = new ImageIcon("src/images/PConfident.gif");
    //Judge
    private ImageIcon JMotion1 = new ImageIcon("src/images/JNormal.gif");
    private ImageIcon JMotion2 = new ImageIcon("src/images/JStren.gif");
    private ImageIcon JMotion3 = new ImageIcon("src/images/JStrenTalking.gif");
    private ImageIcon JMotion4 = new ImageIcon("src/images/JTalking.gif");
    //Witness
    private ImageIcon WMotion1 = new ImageIcon("src/images/WNormal.gif");
    private ImageIcon WMotion2 = new ImageIcon("src/images/WTalking.gif");
    private ImageIcon WMotion3 = new ImageIcon("src/images/WThinking.gif");
    private ImageIcon WMotion4 = new ImageIcon("src/images/WThinkTalking.gif");
    private ImageIcon WMotion5 = new ImageIcon("src/images/WSweat.gif");
    private ImageIcon WMotion6 = new ImageIcon("src/images/WSweatTalking.gif");
    private ImageIcon Memory1 = new ImageIcon("src/images/Memory1.jpg");
    private ImageIcon Memory2 = new ImageIcon("src/images/Memory2.jpg");

	public UI(Main main) {
		this.main = main;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setSize(1024,768);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		lpane.setBounds(0,0,1024,768);
		lpane.setLayout(null);
		frame.setContentPane(lpane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		TextAreaLabel.setIcon(icon3);
		TextAreaLabel.setBounds(-350,460,1600,300);
		
		Text.setBounds(200, 550, 800, 200);
		Text.setFont(new Font("나눔명조", Font.BOLD, 40));
		Text.setEditable(false);
		Text.setForeground(Color.WHITE);
		Text.setOpaque(false);
		Text.setLineWrap(true);
		
		for(int i = 0; i<4; i++) {
			BackLabel[i] = new JLabel();
			BackLabel[i].setBounds(0,0,1024,768);
			}
		BackLabel[0].setIcon(Back1);
		BackLabel[1].setIcon(Back2);
		BackLabel[2].setIcon(Back3);
		BackLabel[3].setIcon(Back4);

		for(int i = 0; i<6; i++) {
			LawyerLabel[i] = new JLabel();
			LawyerLabel[i].setBounds(0,0,960,640);
			LawyerLabel[i].setVisible(false);
		}
		LawyerLabel[0].setIcon(LMotion1);
		LawyerLabel[1].setIcon(LMotion2);
		LawyerLabel[2].setIcon(LMotion3);
		LawyerLabel[3].setIcon(LMotion4);
		LawyerLabel[4].setIcon(LMotion5);
		LawyerLabel[5].setIcon(LMotion6);
		
		for(int i = 0; i<5; i++) {
			ProLabel[i] = new JLabel();
			ProLabel[i].setBounds(0,0,960,640);
			ProLabel[i].setVisible(false);
		}		
		ProLabel[0].setIcon(PMotion1);
		ProLabel[1].setIcon(PMotion2);
		ProLabel[2].setIcon(PMotion3);
		ProLabel[3].setIcon(PMotion4);
		ProLabel[4].setIcon(PMotion5);
		
		for(int i = 0; i<4; i++) {
			JudgeLabel[i] = new JLabel();
			JudgeLabel[i].setBounds(-85,0,1200,800);
			JudgeLabel[i].setVisible(false);
		}
		JudgeLabel[0].setIcon(JMotion1);
		JudgeLabel[1].setIcon(JMotion2);
		JudgeLabel[2].setIcon(JMotion3);
		JudgeLabel[3].setIcon(JMotion4);
		
		for(int i = 0; i<8; i++) {
			WitnessLabel[i] = new JLabel();
			WitnessLabel[i].setBounds(0,0,960,640);
			WitnessLabel[i].setVisible(false);
		}
		WitnessLabel[0].setIcon(WMotion1);
		WitnessLabel[1].setIcon(WMotion2);
		WitnessLabel[2].setIcon(WMotion3);
		WitnessLabel[3].setIcon(WMotion4);
		WitnessLabel[4].setIcon(WMotion5);
		WitnessLabel[5].setIcon(WMotion6);
		WitnessLabel[6].setIcon(Memory1);
		WitnessLabel[6].setBounds(0,0,1024,768);
		WitnessLabel[7].setIcon(Memory2);
		WitnessLabel[7].setBounds(0,0,1024,768);
		
		next = new JButton(">>");
		next.setBounds(904, 550, 90, 90);
		next.setBorderPainted(false);
		next.setFocusPainted(false);
		next.setVisible(true);
		next.addActionListener(new MouseControl(main));
			
		pre = new JButton("<<");
		pre.setBounds(40, 550, 90, 90);
		pre.setBorderPainted(false);
		pre.setFocusPainted(false);
		pre.setVisible(false);
		pre.addActionListener(new MouseControl(main));
		
		SettingPanel.setLayout(null);
		SettingPanel.setBounds(0,1, 1024,695);
		SettingPanel.setBackground(new Color(255,0,0,0));
		SettingPanel.setVisible(true);
		SettingPanel.add(next); 
		SettingPanel.add(pre);
		SettingPanel.add(Text);
		SettingPanel.add(TextAreaLabel);
		
		LawyerPanel = new JPanel();
		LawyerPanel.setLayout(null);
		LawyerPanel.setBounds(0,0, 1024,768);
		LawyerPanel.setVisible(false);
		for(int i = 0; i<6; i++) {
			LawyerPanel.add(LawyerLabel[i]);
		}
		LawyerPanel.add(BackLabel[0]);
		
		ProPanel = new JPanel();
		ProPanel.setLayout(null);
		ProPanel.setBounds(0,0, 1024,768);
		ProPanel.setVisible(false);
		for(int i = 0; i<5; i++) {
			ProPanel.add(ProLabel[i]);
		}
		ProPanel.add(BackLabel[1]);
		
		JudgePanel = new JPanel();
		JudgePanel.setLayout(null);
		JudgePanel.setBounds(0,0, 1024,768);
		JudgePanel.setVisible(false);	
		for(int i = 0; i<4; i++) {
			JudgePanel.add(JudgeLabel[i]);
		}
		JudgePanel.add(BackLabel[2]);

		WitnessPanel = new JPanel();
		WitnessPanel.setLayout(null);
		WitnessPanel.setBounds(0,0, 1024,768);
		WitnessPanel.setVisible(false);
		for(int i = 0; i<8; i++) {
			WitnessPanel.add(WitnessLabel[i]);
		}
		WitnessPanel.add(BackLabel[3]);
		
		ObjectLabel.setIcon(objection);
		ObjectLabel.setBounds(100,-50,1024,768);
		
		Objection.setLayout(null);
		Objection.setOpaque(false);
		Objection.setBounds(0,0, 1024,768);
		Objection.setBackground(new Color(255,0,0,0));
		Objection.setVisible(false);
		Objection.add(ObjectLabel);

		lpane.add(Objection, JLayeredPane.MODAL_LAYER);
		lpane.add(SettingPanel, JLayeredPane.PALETTE_LAYER);
		lpane.add(LawyerPanel, JLayeredPane.DEFAULT_LAYER);
		lpane.add(ProPanel, JLayeredPane.DEFAULT_LAYER);
		lpane.add(JudgePanel, JLayeredPane.DEFAULT_LAYER);
		lpane.add(WitnessPanel, JLayeredPane.DEFAULT_LAYER);	
		}

}
	