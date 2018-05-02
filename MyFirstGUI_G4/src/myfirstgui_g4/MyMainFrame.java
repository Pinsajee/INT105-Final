package myfirstgui_g4;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class MyMainFrame extends JFrame {

    public MyMainFrame() {
        initComponents();
    }

    public MyMainFrame(String title) {
        super(title);
        initComponents();
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(600, 400);
    }
}
