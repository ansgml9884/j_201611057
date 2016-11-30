package com.sd.ch8;
//import com.sd.ch8.Turtle;

public class LandTurtle extends Turtle{
  public void walk(){
    System.out.print("A landturtle walks...");
}
	public static void main(String[] args){
	
		LandTurtle l = new LandTurtle();
		l.setFood("something");
		l.eat();
		l.walk();		
		System.out.print("Land Turtle has "+l.nLimbs+"limbs");
	}
}