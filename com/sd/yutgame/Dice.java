package com.sd.yutgame;

public class Dice { 
    private int number = 0; 
    public int roll() {    
        number = (int) (Math.random() * 6+1); 
	return this.number;
    } 
    public void setNum(int number){
	this.number=number;
    }
    public int getNum() { 
        return this.number; 
    } 

} 
