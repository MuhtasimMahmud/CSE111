import java.util.Scanner;
public class Task3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please give me a word");
    String s = sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
      System.out.println(s.charAt(i)+" : "+(int)(s.charAt(i)));
    }
    sc.close();
  }
}