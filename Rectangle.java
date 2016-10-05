public class Rectangle{
private int width;
private int height;
public Rectangle(int w, int h){
this.width=w;
this.height=h;
}
public int getWidth(){
return width;
}
public int getHeight(){
return height;
}
public void setHeight(int h){
height=h;
}
public void setWidth(int newWidth){
width=newWidth;
}
public void setSize(int w,int h){
setWidth(w);
setHeight(h);
}
public int calcArea(){
return width*height;
}
}
Rectangle rec = new Rectangle(5,7);
rec.calcArea();
rec.setSize(7,3)
rec.setHeight(5);
rec.calcArea();
rec.setHeight(4);
rec.setWidth(5);
rec.calcArea();