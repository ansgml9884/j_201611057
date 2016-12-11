package com.sd.yutgame;

import ch.aplu.turtle.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class YutGame extends DiceGame{
    Turtle t1;
    Turtle t2;
    public YutGame(){
       super();
       setTitle("YUT GAME");
       
    }
    public void actionPerformed(ActionEvent e) {
      JButton b=(JButton)e.getSource();
      if (b == start) {
        t1=new Turtle();
        t2=new Turtle();
    	
	t2.penUp();
        t2.moveTo(0,-150);
        t2.penDown();
        t2.left(90);
	
	t1.penUp();
        t1.moveTo(0,-150);
        t1.penDown();
        t1.left(90);
        
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
	p1=new Player(NameA);
	p2=new Player(NameB);	

     }else if (b == RandomA){
	p1.play(2);
	playerA.setText(p1.getYut());
        turtleTrack(t1,p1.getNum());
  
     }else if (b == RandomB){

	p2.play(2);
      	playerB.setText(p2.getYut());
      	turtleTrack(t2,p2.getNum());

     }
 }	
  public void turtleTrack(Turtle t, int k){
      for(int i=0; i<k; i++){
          for(int j=0;j<22.5; j++){
              t.fd(3);
              t.left(1);
          }
	t.dot(25);
      }
    
  }
 	public static void main(String[] args) { 
		YutGame y = new YutGame(); 
		y.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		y.pack(); 
		y.setSize(350,280);
		y.setVisible(true); 
	}
	 

}
