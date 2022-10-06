import java.util.Scanner;
public class Task7
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int n1=sc.nextInt();
    System.out.println("Please give me a number");
    int n2=sc.nextInt();
    for(int i=1;i<=n1;i++)
    {
      for(int j=1;j<=n2;j++)
      {
        if(i>1 && i<n1 && j>1 && j<n2)
        {
          System.out.print(" ");
        }
        else
        {
          System.out.print(j);
        }
      }
      System.out.println();
    }
    sc.close();
  }
}