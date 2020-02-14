public class Problem3_Week1Java{
    public static void main(String args[]) {
      String s ="azcbobobegghakl";
      String a="";
      String b="";
      for(int i=0;i<s.length();i++){
          int lena=a.length();
          int lenb=b.length();
          int lens=s.length();
          
          a=a+s.charAt(i);
          if(lena>lenb){
              b=a;
          }
          if(i>(lens-2)){
             break;
          }
          if(s.charAt(i)>s.charAt(i+1)){
              a="";
          }
      }
      System.out.println("Longest substring in alphabetical order is " + b);
    }
}