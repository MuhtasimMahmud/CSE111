import java.util.Scanner;
public class Task5
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me a word");
    String s = sc.nextLine();
    for(int i=1;i<=3 ;i++)
    {
      if(i==2)
      {
        System.out.println(s +" ==THE END== ");
      }
      else
      {
        System.out.println(s);
      }
    }
    sc.close();
  }
}