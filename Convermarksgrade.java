public class Convermarksgrade{
  String grade;
  String convert(double marks){  
    
    if(90<=marks && marks<=100){  
       grade="A";
       
    } else if (80<=marks && marks<90){  
        grade="B"; 
    
    } else if (70<=marks && marks<80){  
        grade="C";  
    } else if (60<=marks && marks<70){  
        grade="D";  
    } else{  
        grade="F or input error";
    }      
    return grade;
  }
public static void main(String[] args){
  
  System.out.printf("Your grade is %s",new Convermarksgrade().convert(94)); 
  
  }

}
