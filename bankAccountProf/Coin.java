public class Coin
{  // a constructor for constructing a coin 

   public Coin(double aValue, String aName)
   {  value = aValue;
      name = aName;
   }

   // methods to access the value and name

   public double getValue()
   {  return value;
   }

   public String getName()
   {  return name;
   }

   // instance variables to store the value and name
 
   private double value;
   private String name;
}
