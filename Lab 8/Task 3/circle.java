public class circle extends Point
{
  public circle(double r)
  {
    super(r);
  }
  public double space()
  {
    double area = (3.1416)*(getRadius()*getRadius());
    return area;
  }
  public String toString()
  {
    return "Enter radius of circle :"+getRadius()+" \nCreating a circle....done!"+"\nThe area of circle is "+space();
  }
}