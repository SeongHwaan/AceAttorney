package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class KeyControl implements KeyListener {
    Main main;

    public KeyControl(Main main) {
        this.main = main;

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
        main.ui.lpane.add(main.evidence.EvidencePanel, JLayeredPane.MODAL_LAYER);
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_SHIFT:
                main.evidence.EvidencePanel.setVisible(true);
                main.sound.effectStart((File) main.sound.popup);
                break;
            case KeyEvent.VK_ESCAPE:
                if (main.evidence.EvidencePanel.isVisible() == true) {
                    main.sound.effectStart((File) main.sound.close);
                }
                main.evidence.EvidencePanel.setVisible(false);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}