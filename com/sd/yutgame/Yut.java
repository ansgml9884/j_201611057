package com.sd.yutgame;

public class Yut extends Dice{
   String yut=null;
   public int roll() { 
	setNum((int) (Math.random() * 5) + 1); 
	setYut(); 
	return getNum(); 
 	} 

    public void setYut(){
      if(getNum()==1){
         yut="��";
      }else if(getNum()==2){
         yut="��";
       }else if(getNum()==3){
         yut="��";
       }else if(getNum()==4){
         yut="��";
       }else if(getNum()==5){
         yut="��";
       }else if(getNum()==6){
         yut="����";
       }
     }
    
     public String getYut(){
        return this.yut;
     }
  }
       