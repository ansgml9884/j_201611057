package com.sd.gui;

import javax.swing.*;
import java.awt.*;

//import javax.swing.JFrame;
//import javax.swing.JButton;
//import java.awt.Container;

public class CalcAreaGUIMain{
	public static void main(String[] args){
		JFrame f=new JFrame();
		JPanel panel =new JPanel(new GridLayout(3,2));
		f.getContentPane().add(panel);
		JLabel label1=new JLabel("������");
		JLabel label2=new JLabel("����");
		JTextField radiusTf1=new JTextField(20);
		JTextField areaTf1=new JTextField(20);
		JButton b1=new JButton("���");
		JButton b2=new JButton("���");
		panel.add(label1);
		panel.add(radiusTf1);
		panel.add(label2);
		panel.add(areaTf1);
		panel.add(b1);
		panel.add(b2);
		f.pack();
		f.setVisible(true);
				
		
	}
}