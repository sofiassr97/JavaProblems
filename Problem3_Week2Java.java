public class Problem3_Week2Java {
    
    public static void main(String args[]) {
      double balance =320000;
      double initialbalance=balance;
      double monthlyPaymentRate=0.00;
      double annualInterestRate=0.2;
      double monthlyInterestRate=annualInterestRate/12;
      double lower=initialbalance/12;
      double upper=initialbalance*(Math.pow((1+monthlyInterestRate),12)/12.0);
      double epsilon=0.01;
      
      while (Math.abs(balance)>epsilon){
          monthlyPaymentRate = (upper + lower)/2;
          balance = initialbalance;
          for(int i=0;i<12;i++){
             balance = balance - monthlyPaymentRate + ((balance -  monthlyPaymentRate) * monthlyInterestRate);
            }
          if (balance>epsilon) {
             lower = monthlyPaymentRate;
            }
          else if(balance<(-epsilon)){
             upper = monthlyPaymentRate;
            }
          else{
            break;
            }
          }
      System.out.println("Lowest Payment: "+ String.format("%.2f", monthlyPaymentRate));
      
    }
}