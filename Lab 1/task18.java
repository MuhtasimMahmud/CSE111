import java.util.Scanner;
public class task18
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
      for(int r=1;r<=i;r++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}