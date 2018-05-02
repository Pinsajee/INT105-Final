package myfirstgui_g4;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMainFrame extends JFrame {

    private JButton btnOK;
    private JTextField tfCourseID, tfCredit, tfGrade;
    private JLabel lbCourseID, lbCredit, lbGrade;
    private JPanel panel01, panel02;
    private JTextArea textOutput;

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

        btnOK = new JButton("OK");
        tfCourseID = new JTextField(8);
        tfCredit = new JTextField(3);
        tfGrade = new JTextField(4);

        lbCourseID = new JLabel("Course ID");
        lbCredit = new JLabel("Course ID");
        lbGrade = new JLabel("Course ID");

        panel01 = new JPanel();
        panel02 = new JPanel();

        textOutput = new JTextArea(15, 40);

        panel01.add(lbCourseID);
        panel01.add(tfCourseID);
        panel01.add(lbCredit);
        panel01.add(tfCredit);
        panel01.add(lbGrade);
        panel01.add(tfGrade);
        panel01.add(btnOK);

        panel02.add(textOutput);
        
        MyListennerForMyMainFrame listenMe = new MyListennerForMyMainFrame(this);
        btnOK.addActionListener(listenMe);
        
        this.add(panel01, BorderLayout.NORTH);
        this.add(panel02, BorderLayout.CENTER);

    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public JTextField getTfCourseID() {
        return tfCourseID;
    }

    public JTextField getTfCredit() {
        return tfCredit;
    }

    public JTextField getTfGrade() {
        return tfGrade;
    }

    public JLabel getLbCourseID() {
        return lbCourseID;
    }

    public JLabel getLbCredit() {
        return lbCredit;
    }

    public JLabel getLbGrade() {
        return lbGrade;
    }

    public JPanel getPanel01() {
        return panel01;
    }

    public JPanel getPanel02() {
        return panel02;
    }

    public JTextArea getTextOutput() {
        return textOutput;
    }

}
