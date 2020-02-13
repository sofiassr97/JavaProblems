public class Problem1_Week1Java{
    public static void main(String[] args){
        String Word="azcbobobegghakl";
        int Counter = 0;
        for (int i = 0; i<Word.length() ; i++) {
            if ("a".equals(String.valueOf(Word.charAt(i)))||"e".equals(String.valueOf(Word.charAt(i)))
            ||"i".equals(String.valueOf(Word.charAt(i)))||"o".equals(String.valueOf(Word.charAt(i)))|| 
            "u".equals(String.valueOf(Word.charAt(i)))) {
                Counter +=1;   
                
            }
            
        }
        System.out.println(Counter);
    }
}