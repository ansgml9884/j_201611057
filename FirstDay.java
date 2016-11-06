import java.util.Calendar; 

public class FirstDay { 
   
   public void find() { 
    Calendar c = Calendar.getInstance(); 
		int sum = 0; 
		
		for(int i= 1901; i <=2000; i++) { 
			
			for(int j=0; j<12; j++) { 
				
				c.set(i, j,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1){ 
					sum++; 
			} 
		} 
	} 
		
		System.out.println("20세기에 1일이 일요일인 달이 "+sum+" 번 있습니다."); 
	
	} 
	public static void main(String[] args){ 
		new FirstDay().find(); 
	} 
} 
