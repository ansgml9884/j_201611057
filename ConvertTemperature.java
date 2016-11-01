public class ConvertTemperature{

  double temp;
  String degree;

  public void convertTemperature(double temp,String degree){
      
      if(degree.equals("F")){
          System.out.printf("%.1f"+" C",(temp-32)*5/9); 
     
      } else if(degree.equals("C")){ 
          System.out.printf("%.1f"+" F",temp*9/5+32); 
     
      } else{ 
          System.out.println("Input Error");
      }
}
public static void main(String[] args){
  new ConvertTemperature().convertTemperature(534,"C"); 
}

}