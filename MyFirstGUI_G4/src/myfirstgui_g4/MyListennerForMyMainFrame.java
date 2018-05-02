package myfirstgui_g4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyListennerForMyMainFrame implements ActionListener {
    
    MyMainFrame frame;

    public MyListennerForMyMainFrame(MyMainFrame frame) {
        this.frame = frame;
    }
    
    
            
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(frame.getTfCourseID().getText());
    JTextField courseID = frame.getTfCourseID();
    JTextField credit = frame.getTfCredit();
    JTextField grade = frame.getTfGrade();
    JTextArea output = frame.getTextOutput();
    output.append(frame.getTfCourseID().getText() + "\t" + frame.getTfCredit().getText() + "\t" + frame.getTfGrade().getText() + "\n");

    File f = new File("file/Mygrade.txt");
    FileWriter fw = null;
        try {
            fw = new FileWriter(f);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());;
        } finally {
        try {
            fw.close();
        } catch (Exception ex) {
            
        }
        }
        System.out.println(output.getText());
    }
    
}
