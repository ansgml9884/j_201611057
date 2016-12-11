package com.sd.yutgame;

public class Player { 
    private String name=null; 
    int num=0; 
    String yut=null;
    final int DICE=1, YUT=2;
    public Player(String _name) { 
      name=_name; 
    } 
    public void play(int Num) { 
    	switch(Num){
	case DICE: 
		Dice d=new Dice();
		num=d.roll(); 
		break;
	case YUT:
		Yut y=new Yut();
		num=y.roll();
		yut=y.getYut();
		break;
	default:
		break;
	}
    }

    public String getName() { 
      return this.name; 
    } 
    public int getNum() { 
      return this.num; 
    } 
    public String getYut(){
	return this.yut;
    }
}