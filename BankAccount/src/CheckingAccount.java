import java.awt.font.TransformAttribute;

public class CheckingAccount extends BankAccount{
    private static int FREE_TRANSACTIONS = 3;
    private static double TRANSACTION_FEE  =2.0;
    private double fees = 0;
    private int transactionCount = 0;

    public void deposit(double amount)
    {  transactionCount++;
        // ora somma l'importo al saldo
        super.depostiBalance(amount);
    }

    public void withdraw(double amount)
    {  transactionCount++;
        // ora sottrae l'importo dal saldo
        super.withdrawBalance(amount);
    }

    public void calculatingFees(){
        if (transactionCount>3)
        {
            fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTIONS);
            transactionCount = 0;
            super.withdrawBalance(fees);
        }
    }
}
