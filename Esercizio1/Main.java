//classe main che utilizza la classe aritmetica per restituire la somma tra due numeri
//per runnare compilare prima la classe Aritmetica e dopo questa classe main
//... -> servono per indicare che il metodo potrebbe avere un numero vario di parametri(quindi un metodo potrebbe essere chiamato senza parametri, 
//o con 4,5,6 parametri (numero infinito))
//i campi di una classe sono sempre private
public class Main{
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        Aritmetica x = new Aritmetica();

        System.out.println("Interazione main "+x.Somma(a,b));

        x.Getter();
        Funzione(x);
        x.Getter();
    }
    //nonostante sia passato per valore l'oggetto, le modifiche qui effettuate
    //verranno viste anche nel main, infatti il getter dopo la funzione riporta
    //lo stesso risultato della funzione, ovvero 6
    static void Funzione (Aritmetica x)
    {
        int a = 3;
        int b = 3;
        System.out.println("interazione funzione "+x.Somma(a,b));
    }
}


//parametro implicito: un metodo di un oggetto si riferisce a un parametro che 
//appartiene a se stesso
//un metodo accessore è un metodo getter che quindi legge un parametro 
//ma non lo modifica, mentre il setter modifica
//se passiamo una classe a una funzione, la passiamo per valore ma in realtà
//è per riferimento e quindi si modifica effettivamente
//la variabile statica va assegnata nel costruttore e non è accessibile nei metodi
//tramite this ma nomeclasse.nomeattributostatico 
//package si mette all'inizio del file e serve a raggruppare in un unico pacchetto 
//tutti i file che servono per la compilazione
//java è short circuit quindi la comparazione con false/true o null in un if
//va fatta a sinistra in modo tale che se fosse vero e quindi deve uscire 
//dall'if il resto della comparazione non lo fa proprio 
//== confronta gli indrizzi di memoria delle stringhe mentre equal confronta il contenuto
//equals ce l'hanno tutti gli oggetti, perchè tutte le classi ereditano dall'
//unica classe object che ha definito equals
//incapsulamento prevede che gli attributi vengano nascosti e che vi si acceda 
//soltanto tramite i metodi get (e set per modificarli)
//anzichè ::public per ereditare una sottoclasse si fa sottoclasse extends superclasse
//e la sottoclasse eredita tutti i campi pubblici della superclasse
