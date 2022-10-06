import java.util.Scanner;
public class Task3
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me the radius of circle");
    double r = sc.nextDouble();
    circle c = new circle(r);
    System.out.println(c.toString());
    
    
    System.out.println("Please give me the radius of Sphere");
    double x = sc.nextDouble();
    Sphere s = new Sphere(x);
    System.out.println(s.toString());
    sc.close();
  }
}