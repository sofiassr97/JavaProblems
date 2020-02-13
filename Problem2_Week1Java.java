public class Problem2_Week1Java {
    public static void main(String[]args){
        String Word="azcobobbegghakl";
        int Counter = 0;
        for (int i = 0; i < Word.length() ; i++) {
            if (Word.charAt(i)=='b' &&  Word.charAt(i+1)=='o' && Word.charAt(i+2)=='b') {
            Counter +=1; 

            }
            
        }
        System.out.println(Counter);
        
    }
    
}