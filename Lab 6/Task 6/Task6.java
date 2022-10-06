import java.util.Scanner;
public class Task6
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me the length");
    int length = sc.nextInt();
    Array a = new Array();
    a.arrayMaker(length);
    sc.close();
  }
}