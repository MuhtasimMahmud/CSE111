import java.util.Scanner;
public class Task5
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    double E=sc.nextDouble();
    double R=sc.nextDouble();
    double L=sc.nextDouble();
    double C=sc.nextDouble();
    double f=sc.nextDouble();
    double I=E/(Math.sqrt((R*R)+Math.pow(2,((2*3.1416*f*L)-(1/2*3.1416*f*C)))));
    System.out.println(I);
    sc.close();
  }
}