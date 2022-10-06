public class circle
{
  private double radius = 1.0;
  private String color = "red";
  public circle()
  {
    //default
  }
  
  //@overloaded constructor
  public circle(double radius)
  {
    this.radius = radius;
  }
  public double getRadius()
  {
    return radius;
  }
  public double getArea()
  {
    return (3.1416*(radius*radius));
  }
}