import java.util.ArrayList; 

public class Numbers{ 

	int sum=0; 
	
	ArrayList<Integer> myList = new ArrayList<Integer>(); 

	void sumList(){ 
		
		for(int i=0; i<=1000; i++){ 

			if(i%4==0 && i%5!=0){ 
				
				myList.add(i); 
			} 
		} 
	
		System.out.println("myList = "+myList); 

		for(int a:myList){ 
			sum=sum+a; 
		} 
		
		
		System.out.println("Sum = "+sum); 
	} 
		
	public static void main(String[] args) { 
		
		new Numbers().sumList(); 
	
	} 
 } 
