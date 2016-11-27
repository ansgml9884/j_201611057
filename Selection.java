package com.sd.ch8;

import java.util.*;

public class Selection{
  ArrayList<Rectangle> sArr = new ArrayList<Rectangle>();
  public Selection(){}
  public void select(Rectangle r){
    r.setSelected(true);
    sArr.add(r);
    System.out.println("selected : "+r.getSelected());
  }
  public void print(){
    for(Rectangle r:sArr){
      System.out.println(r.toString());
    }
  }
  public static void main(String[] args){
    Selection s=new Selection();
    Rectangle r=new Rectangle(30,50);
    Cube c=new Cube(40,40,40);
    s.select(r);
    s.select(c);
    s.print();
  }
}
    
