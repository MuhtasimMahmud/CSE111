import java.util.Scanner;
public class Task4
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    int a [] = new int[5];;
    for(int i=0 ;i<a.length;i++)
    {
      int x=sc.nextInt();
      a[i]=x;
      for(int j=0;j<i;j++)
      {
        if(x == a[j])
        {
          System.out.println("Please give an unique number");
          i--;
        }
      }
    }
    for(int i=0; i<a.length;i++)
    {
      System.out.println(a[i]);
    }
    sc.close();
  }
}