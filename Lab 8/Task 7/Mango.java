public class Mango extends Fruit
{
  public Mango()
  {
    super(true , "Mango");
  }
  public String toString()
  {
    String x ="";
    if(super.hasFormalin())
    {
      x = "Mangos are bad for you";
    }
    else
    {
      x = "Mangos are good for you";
    }
    return x;
  }
}