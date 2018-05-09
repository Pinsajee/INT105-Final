package bmiapplicationg4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyAction implements ActionListener {
    
    MainFrame frame;
    
    public MyAction(MainFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double w , h , bmi;
        w = Double.parseDouble(frame.getTfWeight().getText());
        h = Double.parseDouble(frame.getTfHeight().getText());
        h = h/100;
        bmi = w / ( h * h);
        
        JLabel temp = frame.getLbResult();
        temp.setText("BMI = " + bmi);
    }

}
