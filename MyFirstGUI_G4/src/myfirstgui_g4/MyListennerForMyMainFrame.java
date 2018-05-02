package myfirstgui_g4;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListennerForMyMainFrame implements ActionListener {
    
    MyMainFrame frame;

    public MyListennerForMyMainFrame(MyMainFrame frame) {
        this.frame = frame;
    }
    
    
            
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clicked");
    }
    
}
