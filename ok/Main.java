/*concetto di dominio-> ooa(visualizzazione del concetto di dominio) -> ood(generalizzazione della classe software)-> oop( rappresentazione della classe 
tramite linguaggio di programmazione che supporta la programmazione a oggetti (object oriented))*/
import java.awt.Rectangle;
public class Main{
    //main obbligatoriamente pubblico e deve anche essere statico
    public static void main(String[] args){
        System.out.println("xiao");
        
        Rectangle R = new Rectangle(5,10,20,30);
        System.out.println(R);

        R.translate(15,25);
        System.out.println(R);
    } 
} 
//comando javac Main.java per compilarlo , comando java Main per eseguirlo
//java viene utilizzato ed è vincente perchè un file compilato, può essere eseguito su software differenti (così ogni macchina lo interpreta a modo proprio
//senza intralciare il modo in cui gli altri software la interpretano) poichè generalizzato
//per istanziare un oggetto si usa new , ed esistono delle classi già preimpostate di java, ad es. rectangle che prende 4 valori (x, y, larghezza (base), altezza )
//le classi preimpostate come rectangle vanno importate le librerie correlate, in questo caso import java.awt.Rectangle