public class Main{
    public static void main(String[] args){
        String name = "Simone";
        String surname = "Perrotta";
        Cognome x = new Cognome(name,surname);
        String message = x.sayHello();
        System.out.println(message);
    }
}