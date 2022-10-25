//classe astratta contiene per essere tale metodi astratti
//obbliga le sottoclassi ad implementare un comportamento
//i pattern design utilizzano classi astratte (interfacce)
//esempio animale classe astratta con metodo astratto mangia
// sottoclasse estesa gatto che implementa mangia secondo la
// sua modalità di mangiare (quindi la sottoclasse gatto è
// obbligata a definire il metodo mangia poichè nella
// superclasse è definito come astratto
//la superclasse animale non può quindi essere istanziata come oggetto,
//ma può essere istanziato una variabile di animale che viene però
//associata a cane, gatto, ecc.
//cane, gatto, ecc poi farà override sul metodo astratto della
//superclasse e lo definirà secondo la sua modalità
//se nella sottoclasse non definiamo il metodo astratto anche
//questa deve essere dichiarata astratta
//interfaccia è come una classe astratta (tipo evoluzione), è nata
//per essere molto più semplice ma alla fine è molto simile a una classe
//astratta
//interfaccia ha tutti metodi astratti quindi non si può istanziare
//le classi che implementano un interfaccia si dichiarano con implements
//e un interfaccia si dichiara come public interface e deve avere lo stesso nome
//del file su cui viene localizzata
//interfaccia potrebbe essere utilizzata da persona studente insegnante pesci animali
//per interfacciare il metodo respira, che tutte le classi elencate
//hanno in comune
//una classe può implementare più interfacce che svolgono compiti anche diversi
//ma che hanno sempre in comune qualcosa con altre classi
//un'interfaccia può estendere un'altra interfaccia
//da java 8 si è inserita la possibilità di inserire nelle interfacce
//metodi statici che però non vengono ereditati
//e inoltre sempre in java 8 c'è la possibilità di dichiarare metodi default
//
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){
        double balance=0;

        BankAccount simoAccount = new BankAccount();
        simoAccount.depostiBalance(100.0);//depositiamo nel conto 100 euro
        simoAccount.withdrawBalance(50.0);//preleviamo 50 euro
        balance = simoAccount.getBalance();

        System.out.println(balance);//questo output mostrerà come rimanenti 50 euro

        BankAccount flavioAccount = new BankAccount();
        simoAccount.transferBalance(flavioAccount,25.0);
        balance = flavioAccount.getBalance();
        System.out.println(balance);//questo output mostrerà i 25 euro (dell'account di flavio) trasferiti dall'account di simone a flavio

        SavingsInterests interests = new SavingsInterests();
        interests.depostiBalance(100.0);//depositiamo 100 euro
        interests.addInterest(0.5);//aggiungiamo ai 100 euro il 0.5 percento di interesse
        balance = interests.getBalance();
        System.out.println(balance);

        BankAccount[] usersAccount = new BankAccount[10];


        int i  = 0;
        int countDeposit = 0;
        for(i=0;i<10;i++){
            usersAccount[i] = new BankAccount();
            usersAccount[i].depostiBalance(10000.000001);
            countDeposit++;
        }

        DecimalFormat df = new DecimalFormat("0.000000");
        //df.setMaximumFractionDigits(10);

        double somma = 0;
        for(i=0;i<10;i++){
            somma+=usersAccount[i].getBalance();

            System.out.println(df.format(usersAccount[i].getBalance()));
        }

        for(i=0;i<10;i++) {
            usersAccount[i].calculatingTax();
            System.out.println(usersAccount[i].getBalance());
        }
    }
}