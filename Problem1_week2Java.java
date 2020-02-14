public class Problem1_week2Java {
     public static void main(String[] args) {
      double balance =42.00;
      double monthlyPaymentRate=0.04;
      double annualInterestRate=0.2;
      for(int i=0;i<12;i++){
         balance = balance - (balance * monthlyPaymentRate) + ((balance - (balance * monthlyPaymentRate)) * (annualInterestRate/12));
          }
      System.out.println("Remaining Balance: "+ String.format("%.2f", balance));
    }
}