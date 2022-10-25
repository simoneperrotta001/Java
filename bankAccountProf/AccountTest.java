public class AccountTest
{  public static void main(String[] args)
   {  SavingsAccount momsSavings 
         = new SavingsAccount(0.5);
         
      TimeDepositAccount collegeFund 
         = new TimeDepositAccount(1, 3);
         
      CheckingAccount harrysChecking
         = new CheckingAccount(0);
         
      momsSavings.deposit(10000);
      collegeFund.deposit(10000);
      
      momsSavings.transfer(harrysChecking, 2000);
      collegeFund.transfer(harrysChecking, 980);
      
      harrysChecking.withdraw(500);
      harrysChecking.withdraw(80);      
      harrysChecking.withdraw(400);      

      endOfMonth(momsSavings);
      endOfMonth(collegeFund);
      endOfMonth(harrysChecking);
      
      printBalance("risparmi della mamma", momsSavings);
         // $10000 - $2000 + 0.5% interest = $8040
      printBalance("fondo per il college", collegeFund);
         // $10000 - $980 - $20 penalty + 1% interest
         // = $9090
      printBalance("conto corrente di Harry", harrysChecking);
         // $2000 + $980 - $500 - $80 - $400 - $4 fees
         // = $1996
   }
   
   public static void endOfMonth(SavingsAccount savings)
   {  savings.addInterest();
   }
   
   public static void endOfMonth(CheckingAccount checking)
   {  checking.deductFees();
   }
   
   public static void printBalance(String name,
      BankAccount account)
   {  System.out.println("il saldo di " + name
         + " e' di $" + account.getBalance());
   }
}