import java.util.Scanner;
public class Task9
{
  public static void main(String [] args)
  {
    Choose c = new Choose();
    
    
    Scanner sc= new Scanner(System.in);
    
    int a [] = new int [4];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Please give me a number");
      int x = sc.nextInt();
      a[i]=x;
    }
    System.out.println("1) only numbers at odd position \n 2) only numbers at even position \n 3) all numbers");
    System.out.println("Please choose one");
    int l = sc.nextInt();
    
    if(l == 1)
    {
      c.Odd(a);
    }
    else if(l == 2)
    {
      c.Even(a);
    }
    else if(l == 3)
    {
      c.All(a);
    }
    sc.close();
  }
}