import java.util.Scanner;
public class Task5
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    int a [] =new int[10];
    for(int i=0;i<a.length;i++)
    {
      a[i] = sc.nextInt();
    }
    int flag = 1;
    System.out.println("\n\n\n Please give me another number");
    int n=sc.nextInt();
    for(int i=0;i<a.length;i++)
    {
      if(n == a[i])
      {
        flag = 1;
        break;
      }
      else
      {
        flag =2;
      }
    }
    if(flag == 1)
    {
      System.out.println("Yes");
    }
     if(flag == 2)
    {
      System.out.println("No");
    }
    sc.close();
  }
}