public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }//costruttore che setta il bilancio a 0

    public double getBalance(){
        return balance;
    }//ritorna il bilancio

    public void depostiBalance(double x){
        balance += x;
    }

    public void withdrawBalance(double x){
        balance -= x;
    }

    public void calculatingTax(){
        if(balance>5000)
            balance -= balance/100*10;
    }

    public void transferBalance(BankAccount other, double x){
        withdrawBalance(x);
        other.depostiBalance(x);
    }
}
