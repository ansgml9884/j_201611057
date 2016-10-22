package com.sd.dicegame;

public class Player { 
    private String name=null; 
    int num=0; 
    int score=0;
    public Player(String _name) { 
      name=_name; 
      } 
    public void play() { 
      Dice d=new Dice(); 
      d.roll(); 
      int num1=d.getNum();
      d.roll(); 
      int num2=d.getNum();
      num=num1+num2;
      System.out.println(name+" turn on "+num1+" + "+num2+" = "+num);
      } 
    public String getName() { 
      return this.name; 
      } 
    public int getNum() { 
      return this.num; 
      } 
    public int getScore(){
      score=score+1;
      return score;
 } 
}
