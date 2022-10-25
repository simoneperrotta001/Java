public class Purse {
    private int nickels;
    private int dimes;
    private int quarter;
    private float total = 0.0f;

    public void addNickels(int x){
        this.nickels =  this.nickels + x;
    }

    public void addDimes(int x){
        this.dimes = this.dimes + x;
    }

    public void addQuarter(int x){
        this.quarter =  this.quarter + x;
    }

    public float getTotal(){
        this.total = this.nickels * 0.05f + this.dimes * 0.1f + this.quarter * 0.25f;
        
        return this.total;
    }
}
