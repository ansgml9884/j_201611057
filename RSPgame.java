class RSPgame{

  void rspGame(String userA, String userB){

    String a="A is winner!";
    String b="B is winner!";

    if (userA.equals(userB)){ 
      System.out.println("Draw");
  
      }
 
    else{ 

        if (userA.equals("rock") && userB.equals("scissors")){ 
          System.out.println(a);
        
        } else if (userA.equals("scissors") && userB.equals("rock")){ 
          System.out.println(a); 
        
        } else if (userA.equals("paper") && userB.equals("rock")){ 
          System.out.println(a); 
        
        } else {
          System.out.println(b);
        }
    
    } 
   } 
public static void main(String[] args){
  new RSPgame().rspGame("rock","paper"); }
}