public class Problem2_Week2Java {
    public static void main(String args[]) {
      double balance =3329;
      double initialbalance=balance;
      double monthlyPaymentRate=0.00;
      double annualInterestRate=0.2;
      double monthlyInterestRate=annualInterestRate/12;
      
      while(balance>0){
          for(int i=0;i<12;i++){
             balance = balance - monthlyPaymentRate + ((balance -  monthlyPaymentRate) * monthlyInterestRate);
            }
          if (balance>0) {
             monthlyPaymentRate += 10;
             balance=initialbalance;
            }
          else if(balance<=0){
            break;
            } 
          }
      System.out.println("Lowest Payment: "+ monthlyPaymentRate);
    }
}