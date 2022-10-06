public class Child extends Parent
{
  String address="//";
  public Child()
  {
    //default
  }
  public void methodA()
  {
    super.methodA();
    System.out.println(address);
  }
}