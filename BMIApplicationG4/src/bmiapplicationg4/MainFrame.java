package bmiapplicationg4;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

    private JPanel pnTopPanel, pnMidPanel, pnButtonPanel;
    private JLabel lbWeight, lbHeight, lbResult;
    private JTextField tfWeight, tfHeight;
    private JButton btnCompute;

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
        this.lbResult = new JLabel("BMI = ...");

        this.pnMidPanel = new JPanel();
        pnMidPanel.add(btnCompute);
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

    

}
