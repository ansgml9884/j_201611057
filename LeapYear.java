public class LeapYear{
 
  void leapYear(int[] yearList){
   
    for(int y:yearList){
   
      if ((y%4 == 0 && y%100 !=0)|| y%400==0){
      System.out.println( y +" is Leap Year!");
   
    } else {
      System.out.println( y +" is not Leap year");
    }
  }  
 }
  public static void main(String[] args){
    
    int[] years={1876, 1904, 1966, 1999, 2000, 2013,2034};
    
    new LeapYear().leapYear(years);
 
   }
}
