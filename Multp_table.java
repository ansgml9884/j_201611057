public class Multp_table { 
  
  void multp_table() { 
    for(int i=1; i<=9; i++){
      for(int j=1; j<=9; j++) { 
        System.out.printf("%d * %d = %2d", i, j, (j*i)); 
        System.out.print("\t"); 
      } 
     System.out.print("\n"); 
    } 
	} 
	public static void main(String[] args) { 
			new Multp_table().multp_table(); 
	} 
  
} 
