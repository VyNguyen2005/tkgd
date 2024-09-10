/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleCalculator;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class MyWindows extends JFrame{
    private JLabel lbNum1, lbNum2, lbNum3;
    private JTextField txtNum1, txtNum2, txtNum3;
    private JButton btnAdd, btnSub, btnMul, btnDiv;

    public MyWindows(String title){
        super(title);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(lbNum1 = new JLabel("Number 1"));
        panel.add(txtNum1 = new JTextField(10));
        panel.add(lbNum2 = new JLabel("Number 2"));
        panel.add(txtNum2 = new JTextField(10));
        panel.add(lbNum3 = new JLabel("Number 3"));
        panel.add(txtNum3 = new JTextField(10));
        
        panel.add(btnAdd = new JButton("Add"));
        panel.add(btnSub = new JButton("Sub"));
        panel.add(btnMul = new JButton("Mul"));
        panel.add(btnDiv = new JButton("Div"));
        
        lbNum1.setBounds(20, 10, 180, 30);
        txtNum1.setBounds(100, 10, 180, 30);
        
        lbNum2.setBounds(20, 50, 180, 30);
        txtNum2.setBounds(100, 50, 180, 30);
        
        add(panel);
        
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MyWindows frame = new MyWindows("Simple Calculator");
        frame.setVisible(true);
    }
    
}
