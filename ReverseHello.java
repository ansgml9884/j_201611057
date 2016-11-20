public class ReverseHello{

    void reverse(String word){
        char[] chArr=word.toCharArray();
        StringBuilder re_word=new StringBuilder();
        for(int i=chArr.length-1;i>=0;i--){
            re_word.append(chArr[i]);
        }
        System.out.println(re_word);
      }
    public static void main(String[] args){
        String hello="hello";
        new ReverseHello().reverse(hello);
    }
  }
        