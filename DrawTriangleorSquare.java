package com.sd.turtle;

import ch.aplu.turtle.*;
import java.util.*;

public class DrawTriangleorSquare{

   Turtle t1=new Turtle();

   int size=150;
   int sides;
   double angle;
   
   enum Shape {TRIANGLE, SQUARE}
   
   Scanner sc = new Scanner(System.in);
   
   public void question(){
   
      System.out.println("Select Triangle(T) or Square(S)");
           
      String str = sc.next();
      Shape se1=null;
      
      if(str.equals("T")){
        se1 = Shape.TRIANGLE;
      }
      
      else if (str.equals("S")){
        se1 = Shape.SQUARE; 
      }
                                                                                                                                                       
      drawTriangleorSquare(se1);      
   }
   
   
   public void drawTriangleorSquare(Shape sel){

      
      switch (sel) {
             case TRIANGLE:
                 sides=3;
                 angle=120;
                 break;
             case SQUARE:
                 sides=4;
                 angle=90;
                 break;
      }
      
 
      for(int i=0;i<sides;i++){
         t1.forward(size);
         t1.right(angle);
      }
        
   }

   public static void main(String[]args){
   
      new DrawTriangleorSquare().question();

   }
   
}