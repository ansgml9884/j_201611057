package com.sd.gui;  
 
import java.awt.GridLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JLabel; 
import javax.swing.JTextField; 
import javax.swing.JButton; 

 
public class CalcAreaGUIMain2 extends JFrame implements ActionListener { 
  private JPanel panel; 
	private JLabel label1, label2; 
 	private JTextField tf1, tf2; 
	private JButton bt1, bt2; 
	private Double radius, area; 
	 
	public CalcAreaGUIMain2() { 
    panel = new JPanel(new GridLayout(3, 2)); 
    getContentPane().add(panel); 
		 
    label1 = new JLabel("Radius"); 
    label2 = new JLabel("Area"); 
    tf1 = new JTextField(10); 
    tf2 = new JTextField(10); 
    bt1 = new JButton("Compute"); 
    bt2 = new JButton("Cancel"); 
		 
    bt1.addActionListener(this); 
    bt2.addActionListener(this); 

    panel.add(label1); 
		panel.add(tf1); 
		panel.add(label2); 
		panel.add(tf2); 
		panel.add(bt1); 
		panel.add(bt2); 
	} 
	 
	@Override 
	public void actionPerformed(ActionEvent e) { 
		JButton bt = (JButton)e.getSource(); 
		if (bt == bt1) { 
			bt.setText("Complete"); 
				 
			radius = Double.parseDouble(tf1.getText()); 
			area = Math.pow(radius, 2) * Math.PI; 
 
			tf2.setText(String.format("%.2f", area)); 
		} 
		else if (bt == bt2) { 
  	  tf1.setText(""); 
			tf2.setText(""); 
		} 
	} 
	 
	public static void main(String[] args) { 
		CalcAreaGUIMain2 c = new CalcAreaGUIMain2(); 
		c.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		c.pack(); 
		c.setVisible(true); 
	} 
} 
