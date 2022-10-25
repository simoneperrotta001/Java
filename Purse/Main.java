import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        float total = 0;

        Purse myPurse = new Purse();
        String input = JOptionPane.showInputDialog("how many nickels do you have?");
        int count  = Integer.parseInt(input);
        myPurse.addNickels(count);

        total = myPurse.getTotal();

        System.out.println(total);
    }
}