//classe che restituisce la somma di due numeri dati in input (dalla classe main)
public class Aritmetica{
    int x;
    public int Somma(int a, int b)
    {
        this.x = a+b;
        return(x);
    }
    public void Getter()
    {
        System.out.println("interazione getter "+this.x);
    }
}