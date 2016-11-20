import java.util.*;

public class CountingChars{
      
      Map<String,Integer> wc = new HashMap<String,Integer>();
      
      
      void countChars(String strs){
      
      char[] letters=strs.toCharArray();
      String s;
      
      for(char c:letters){
         s=Character.toString(c);
         if(wc.containsKey(s)){
            wc.put(s,wc.get(s)+1);
         }else{
            wc.put(s,1);
          }
        }
        
       System.out.println(wc); 
      }
      
      public static void main(String[] args){
         
         String words="sangmyung university";
         new CountingChars().countChars(words);
      }
     }
          