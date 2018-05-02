package myfirstgui_g4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class MyListennerForMyMainFrame implements ActionListener {
    
    MyMainFrame frame;

    public MyListennerForMyMainFrame(MyMainFrame frame) {
        this.frame = frame;
    }
    
    
            
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(frame.getTfCourseID().getText());
    JTextField temp = frame.getTfCourseID();
        System.out.println(temp.getText());
    
    }
    
}
