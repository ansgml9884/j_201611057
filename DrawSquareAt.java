import ch.aplu.turtle.*;
class DrawSquareAt{
    Turtle t1=new Turtle();
    public void drawSquareAt(int size,double x, double y){
        t1.penUp();
        t1.moveTo(x,y);
        t1.penDown();
        for(int i=0;i<4;i++){
            t1.fd(size);
            t1.right(90);
           }
        }
    public static void main(String []args){
        new DrawSquareAt().drawSquareAt(100,-40,-30);
        }
 }