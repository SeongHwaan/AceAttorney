package game;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class Evidence{

	Main main;
	
	public JPanel EvidencePanel;
	public JButton Evidence[]= new JButton[5];
	public JLabel EvidenceText[] = new JLabel[5];
	public JLabel EvidenceUI = new JLabel();
    //Evidence
    private ImageIcon Evi1 = new ImageIcon("src/images/BadgeIcon.png");
    private ImageIcon Evi2 = new ImageIcon("src/images/AutopsyIcon.png");
    private ImageIcon Evi3 = new ImageIcon("src/images/DecoIcon.png");
    private ImageIcon Evi4 = new ImageIcon("src/images/PassportIcon.png");
    private ImageIcon Evi5 = new ImageIcon("src/images/BlackoutIcon.png");
    //EvidenceExplain
    private ImageIcon EviText1 = new ImageIcon("src/images/BadgeText.png");
    private ImageIcon EviText2 = new ImageIcon("src/images/AutopsyText.png");
    private ImageIcon EviText3 = new ImageIcon("src/images/DecoText.png");
    private ImageIcon EviText4 = new ImageIcon("src/images/PassportText.png");
    private ImageIcon EviText5 = new ImageIcon("src/images/BlackoutText.png");
    private ImageIcon Evidenceui = new ImageIcon("src/images/EvidenceUI.png");
    
	public Evidence(Main main) {
		this.main = main;
		EvidenceUI.setIcon(Evidenceui);
		EvidenceUI.setBounds(0,0,800,338);
		
		for(int i = 0; i<5; i++) {
			EvidenceText[i] = new JLabel();
			EvidenceText[i].setBounds(20,25,750,200);
		}
    	EvidenceText[0].setIcon(EviText1);
    	EvidenceText[1].setIcon(EviText2);
    	EvidenceText[2].setIcon(EviText3);
    	EvidenceText[3].setIcon(EviText4);
    	EvidenceText[4].setIcon(EviText5);
    	
    	Evidence[0] = new JButton("배지");
    	Evidence[0].setBounds(40, 240, 80, 80);
    	Evidence[1] = new JButton("부검");
    	Evidence[1].setBounds(130, 240, 80, 80);
    	Evidence[2] = new JButton("장식");
    	Evidence[2].setBounds(220, 240, 80, 80);
    	Evidence[3] = new JButton("여권");
    	Evidence[3].setBounds(310, 240, 80, 80);
    	Evidence[4] = new JButton("정전");
    	Evidence[4].setBounds(400, 240, 80, 80);
    	for(int i = 0; i<5; i++) {
    		Evidence[i].setBorderPainted(false);
        	Evidence[i].setFocusPainted(false);
    		Evidence[i].setFont(new Font("고딕", Font.BOLD, 15));
    		}
    	for(int i = 0; i<5; i++) {
    	Evidence[i].addActionListener(new MouseControl(main));
    	}	
    	
    	EvidencePanel = new JPanel();
    	EvidencePanel.setLayout(null);
    	EvidencePanel.setBounds(110,80, 800, 338);
    	EvidencePanel.setBackground(new Color(255,0,0,0));
    	EvidencePanel.setVisible(false);
    	EvidencePanel.setFocusable(false);
    	
    	for(int i = 0; i<5; i++) {
			EvidencePanel.add(EvidenceText[i]);
			EvidencePanel.add(Evidence[i]);
		}
    	EvidencePanel.add(EvidenceUI);
    }
}

