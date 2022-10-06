import java.util.Scanner;
public class Task10
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me a word");
    String x = sc.nextLine();
    System.out.println("Please give me another word");
    String y = sc.nextLine();
    mg m = new mg(x);
    System.out.println(m.equals(y));
    sc.close();
  }
}