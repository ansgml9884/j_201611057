import ch.aplu.turtle.*;
import java.util.ArrayList;

public class TurtleTracks{
      
     Turtle t1=new Turtle();
     ArrayList<Double[]> posArr = new ArrayList<Double[]>();
     Double[] pos=new Double[2];
     
     public void drawSquareAtSave(int size,double x, double y){
         t1.penUp();
         t1.moveTo(x,y);
         t1.penDown();
         for(int i=0;i<4;i++){
             pos[0]=t1.getX();
             pos[1]=t1.getY();
             posArr.add(pos);
             t1.fd(size);
             t1.right(90);
          }
          for(Double[] d:posArr){
              System.out.printf("(%.1f,%.1f)",d[0],d[1]);
          }
      }
  public static void main(String[] args){
      new TurtleTracks().drawSquareAtSave(100,0,50);
      }
 }
     
        
          