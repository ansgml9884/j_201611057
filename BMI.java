public class BMI { 

	public String bmi(float h, float w) { 
    
	float bmi = w / (h * h); 
	String res;
		
	System.out.printf("BMI = %.1f",bmi); 			

	if (bmi <= 18.5){ 
        	res="low";
     	} else if (bmi >= 18.5 && bmi < 23) { 
        	res="normal"; 
     	} else if (bmi >= 23 && bmi < 25) {
        	res="risky"; 
	} else if (bmi >= 25 && bmi < 30) {
       		res="obesity 1"; 
     	} else if (bmi >= 30 && bmi < 40) {
       		 res="obesity 2"; 
     	} else if (bmi >= 40) {
       		res="obesity 3"; 
    	} else {
        	res="error"; 
    	} 
     	
	return res;
 }

	public static void main(String[] args) { 
	  
	float weight=(float)58.5;
    	float height=(float)1.7;
    
	System.out.print("  Your BMI is "+new BMI().bmi(height,weight)); 
	
	} 
} 
