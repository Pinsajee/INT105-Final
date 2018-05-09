package bmiapplicationg4;

import javax.swing.*;

public class BMIApplicationG4 {

    public static void main(String[] args) {
        MainFrame frame = new MainFrame("BMI Calculator");
        MyAction action = new MyAction(frame);
        frame.getBtnCompute().addActionListener(action);
        frame.setVisible(true);

    }

}
