public class SavingsInterests extends BankAccount{
    private double interest;

    public void addInterest(double interestRate){
        double balance = getBalance();//eredita il metodo pubblico dalla superclasse e stampiamo il bilancio
        System.out.println(balance);
        interest = balance * interestRate/100;//aggiungiamo l'interesse e lo torniamo al main
        depostiBalance(interest);
    }
}
