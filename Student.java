import java.util.ArrayList;
import java.util.Collections;

public class Student{
    
    private String name;
    private int stdNum;
    
    Student(String name,int stdNum){
        this.name=name;
        this.stdNum=stdNum;
    }
    
    public String getName(){
        return name;
    }
    
    public static void main(String[] args){
    
         ArrayList<String> studentNameList=new ArrayList<String>();
         Student s1=new Student("KMH",201611057);
         Student s2=new Student("LMA",201670021);
         
         studentNameList.add(s1.getName());
         studentNameList.add(s2.getName());
         
         Collections.sort(studentNameList);
         System.out.println(studentNameList);
     }
  }
         