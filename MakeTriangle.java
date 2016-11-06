class MakeTriangle{
 
  StringBuffer sbuf=new StringBuffer();

  String s="*";
  String b=" ";
 
  void makeTriangle(){
 
    for(int i=0;i<6;i++){
    
      for(int k=0;k<i;k++){
      sbuf.append(b);
      }
      
      for(int j=0;j<(11-(2*i));j++){
      sbuf.append(s);
      }
      
      System.out.printf("%s\n",sbuf.toString());
      sbuf.delete(0,sbuf.length());
      
        }
     
     }
    public static void main(String[] args){
    
      new MakeTriangle().makeTriangle();
    
    }
  }