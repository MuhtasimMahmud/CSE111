import java.util.Scanner;
public class Task9
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int k=1;k<=(n-i);k++)
      {
        System.out.print(" ");
      }
      for(int j=n;j>n-i;j--)
      {
        if(i>2 && i<n && j<n )
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