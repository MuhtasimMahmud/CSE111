public class Jackfruit extends Fruit
{
  public Jackfruit()
  {
    super(false , "Jackfruit");
  }
  public String toString()
  {
    String x ="";
    if(super.hasFormalin())
    {
      x = "Jackfruits are bad for you";
    }
    else
    {
      x = "Jackfruit are good for you";
    }
    return x;
  }
}