  import java.util.Scanner;
public class Task6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me a number");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int s=1;s<=(n-i);s++)
      {
        System.out.print(" ");
      }
      for(int k=1;k<=(2*i-1);k++)
      {
        System.out.print(k);
      }
      System.out.println();
    }
    for(int i=n-1;i>=1;i--)
    {
      for(int s=1;s<=(n-i);s++)
      {
        System.out.print(" ");
      }
      for(int k=1;k<=(2*i-1);k++)
      {
        System.out.print(k);
      }
      System.out.println();
    }
    sc.close();
  }
}