public class Cognome{
    private String name;
    private String surname;

    public Cognome(String aName, String aSurname)
    {
        name = aName;
        surname = aSurname;
    }

    public String sayHello(){
        String message = "Hello, "+name + " "+surname+".";

        return message;
    }
}