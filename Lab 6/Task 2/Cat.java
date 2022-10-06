public class Cat
{ 
  public String color = "White"; 
  public String action = "sitting"; 
  public Cat()
  {
    //default
  }
  public Cat(String color)
  {
    this.color = color;
  }
  public Cat(String color ,String action)
  {
    this.color = action;
    this.action = color;
  }
  public void changeColor(String color)
  {
    this.color = color;
  }
  public void printCat()
  {
    System.out.println(color + " cat is " + action);
  }
}