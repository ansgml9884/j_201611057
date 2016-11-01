import java.util.*;

public class ConvertTemperature2{

  Scanner tp = new Scanner(System.in);

  public void convertTemperature(){
     
      System.out.println("User input temperature: ");
      float temp = Float.parseFloat(tp.next());
      System.out.println("F or C");
      String degree=tp.next();
      
      if(degree.equals("F")){
          System.out.printf("%.1f"+"C",(temp-32)*5/9); 
     
      } else if(degree.equals("C")){ 
          System.out.printf("%.1f"+"F",temp*9/5+32); 
     
      } else{ 
          System.out.println("Input Error");
      }
}
public static void main(String[] args){
  new ConvertTemperature2().convertTemperature(); 
}

}