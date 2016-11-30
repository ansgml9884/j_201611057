package com.sd.ch8;
//import com.sd.ch8.Turtle;

public class SeaTurtle extends Turtle{
  public void swim(){
    System.out.print("A seaturtle swims...");}
  public static void main(String[] args){
	SeaTurtle s= new SeaTurtle();
	s.setFood("something");
	s.eat();
	s.swim();
	System.out.print("Seaturtle has "+s.nLimbs+"limbs");
	}
}