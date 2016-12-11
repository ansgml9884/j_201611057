package com.sd.yutgame;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import java.util.Scanner;

public class DiceGame extends JFrame implements ActionListener {  
    Player p1,p2;
    JTextField playerA, playerB;
    JLabel label1, label2;
    JButton start, RandomA, RandomB, winner;
    String NameA,NameB;
    JPanel panel,panel2;
    public DiceGame(){
		setTitle("DICE GAME");
  		panel = new JPanel(new FlowLayout()); 
		getContentPane().add(panel); 
 		label1=new JLabel("Who is PlayerA ?");
		label2=new JLabel("Who is PlayerB ?");
		playerA=new JTextField(15);
		playerB=new JTextField(15);
		start = new JButton("Game Start!");
		label1.setPreferredSize(new Dimension(100,50));
		label2.setPreferredSize(new Dimension(100,50));
		start.setPreferredSize(new Dimension(200,100));
		start.addActionListener(this);
		panel.add(label1);
		panel.add(playerA);
		panel.add(label2);		
		panel.add(playerB);
		panel.add(start);
		panel.setVisible(true);

   }

   public void actionPerformed(ActionEvent e) {
  		JButton b=(JButton)e.getSource();
		
		if (b == start) {
			NameA=playerA.getText();
			NameB=playerB.getText();
			label1.setText(NameA);
			label2.setText(NameB);
			playerA.setText("");
			playerB.setText("");
			start.setPreferredSize(new Dimension(0,0));
			RandomA=new JButton("RandomA");	
			RandomA.setPreferredSize(new Dimension(100,80));
			panel.add(RandomA);
			RandomA.addActionListener(this);
			RandomB=new JButton("RandomB");	
			RandomB.setPreferredSize(new Dimension(100,80));
			panel.add(RandomB);
			RandomB.addActionListener(this);
			winner=new JButton("winner");	
			winner.setPreferredSize(new Dimension(150,30));
			panel.add(winner);
			winner.addActionListener(this);
			p1=new Player(NameA);
			p2=new Player(NameB);


		}else if (b == RandomA){
			p1.play(1);
			playerA.setText(Integer.toString(p1.getNum()));

		}else if (b == RandomB){
			p2.play(1);
        		playerB.setText(Integer.toString(p2.getNum()));

         	}else if(b==winner){
			if(p1.getNum()>p2.getNum()){
          			playerA.setText("Congraturation");
        		}else if(p1.getNum()==p2.getNum()){
         			playerA.setText("Draw");
				playerB.setText("Draw");
                	}else{
          			playerB.setText("Congraturation");
        		}
		}

 	
	}    	

	public static void main(String[] args) {
  		DiceGame d=new DiceGame();
 		d.setDefaultCloseOperation(EXIT_ON_CLOSE);
  		d.pack();
		d.setSize(350,280);
		d.setVisible(true);
	 }



 } 
  
