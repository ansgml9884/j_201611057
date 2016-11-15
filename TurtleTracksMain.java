import ch.aplu.turtle.*;

public class TurtleTracksMain{
    Turtle t1=new Turtle();
    void drawSquareFrom(double[][] tracks){
          for(double[] t:tracks){
             t1.moveTo(t[0],t[1]);
          }
    }
    public static void main(String[] args){
          double tracks[][]={{0,0},{0,150},{150,150},{150,0},{0,0}};
          new TurtleTracksMain().drawSquareFrom(tracks);
         }
   }