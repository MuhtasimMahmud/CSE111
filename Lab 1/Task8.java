import java.util.Scanner;
public class Task8
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        if(i>2 && i<n && j!=1 && i!=j)
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