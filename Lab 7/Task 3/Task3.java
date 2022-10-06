import java.util.Scanner;
public class Task3
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me a word");
    String x = sc.nextLine();
    System.out.println("Please give me another word");
    String y = sc.nextLine();
    A a = new A(x);
    System.out.println(a.startsWith(y));
    sc.close();
  }
}