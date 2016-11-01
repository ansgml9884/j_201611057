import ch.aplu.turtle.*;

public class MakeSwirlsSquare{

 Turtle t1 = new Turtle();
 
 void makeSwirlsSquare(int size,int bigger,int turns,double angle){ 
     for(int i=0;i<turns;i++){ 
         if(i%2!=0){ 
              size+=bigger; 
              t1.forward(size); 
              t1.right(angle);
         } else {  
              t1.fd(size); 
              t1.right(angle);
  }
 }
 } 
 public static void main(String args[]){
  new MakeSwirlsSquare().makeSwirlsSquare(10,15,25,90.0);
 } 
} 
