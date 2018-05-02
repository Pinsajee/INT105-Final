package myfirstgui_g4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFirstGUI_G4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My first app");
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        JPanel panal01 = new JPanel();
        
        JButton buttonOK = new JButton("OK");
        
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("OK button clicked");
            }
        });
                
        JTextField tfCourseID = new JTextField(10);
        JLabel lbCourseID = new JLabel("Course ID");
        
        JTextField tfCredit = new JTextField(5);
        JLabel lbCredit = new JLabel("Credit");
        
        JTextField tfGrade = new JTextField(5);
        JLabel lbGrade = new JLabel("Grade");
        
        panal01.add(lbCourseID);
        panal01.add(tfCourseID);
        panal01.add(lbCredit);
        panal01.add(tfCredit);
        panal01.add(lbGrade);
        panal01.add(tfGrade);
        panal01.add(buttonOK);
        
        

        frame.add(panal01);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
