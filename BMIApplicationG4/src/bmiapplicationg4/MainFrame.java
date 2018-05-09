package bmiapplicationg4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainFrame extends JFrame {

    private JPanel pnTopPanel, pnMidPanel, pnButtonPanel;
    private JLabel lbWeight, lbHeight, lbResult;
    private JTextField tfWeight, tfHeight;
    private JButton btnCompute, btnCompute2, btnCompute3;

    public MainFrame() {
        initComponents();
    }

    public MainFrame(String title) throws HeadlessException {
        super(title);
        initComponents();
    }

    private void initComponents() {
        this.setSize(600, 400);
        this.setLayout(new GridLayout(3, 1));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.lbWeight = new JLabel("Weight (kg.)");
        this.lbHeight = new JLabel("Height (cm.)");
        this.tfWeight = new JTextField(9);
        this.tfHeight = new JTextField(9);

        this.pnTopPanel = new JPanel();
        this.pnTopPanel.setLayout(new GridLayout(2, 2));
        pnTopPanel.add(lbWeight);
        pnTopPanel.add(tfWeight);
        pnTopPanel.add(lbHeight);
        pnTopPanel.add(tfHeight);
        this.add(pnTopPanel, BorderLayout.NORTH);

        this.btnCompute = new JButton("Compute BMI");
        this.lbResult = new JLabel("BMI = 0.0");
        this.btnCompute2 = new JButton("Compute BMI (2)");
       
        // create Action by create annonymous class
        btnCompute2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute2();
            }
        }
        );
        
        
        this.btnCompute3 = new JButton("Compute BMI (3)");
        MyAction3 action3 = new MyAction3();
        btnCompute3.addActionListener(action3);

        this.pnMidPanel = new JPanel();
        pnMidPanel.add(btnCompute);
        pnMidPanel.add(btnCompute2);
        pnMidPanel.add(btnCompute3);
        
        this.add(pnMidPanel);
      

        this.pnButtonPanel = new JPanel();
        pnButtonPanel.add(lbResult);
        this.add(pnButtonPanel);

    }

    public JLabel getLbResult() {
        return lbResult;
    }

    public JTextField getTfWeight() {
        return tfWeight;
    }

    public JTextField getTfHeight() {
        return tfHeight;
    }

    public JButton getBtnCompute() {
        return btnCompute;
    }

    public void compute2() {
        double w, h, bmi;
        w = Double.parseDouble(tfWeight.getText());
        h = Double.parseDouble(tfHeight.getText());
        h = h / 100;
        bmi = w / (h * h);
        lbResult.setText("BMI (2) : " + bmi);

    }
    
    // annonymous class
    public void compute3() {
        double w, h, bmi;
        w = Double.parseDouble(tfWeight.getText());
        h = Double.parseDouble(tfHeight.getText());
        h = h / 100;
        bmi = w / (h * h);
        lbResult.setText("BMI (3) : " + bmi);

    }
    
    // create action by innerclass
    class MyAction3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            compute3();
        }
        
    }

}
