public class Sphere extends Point
{
  public Sphere(double x)
  {
    super(x);
  }
  public double space()
  {
    double area = 4*(3.1416)*(getRadius()*getRadius());
    return area;
  }
  public String toString()
  {
    return "Enter radius of circle :"+getRadius()+" \nCreating a circle....done!"+"\nThe area of circle is "+space();
  }
}