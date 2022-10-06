import java.util.Scanner;
public class Task8
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int a [] = new int[10];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Please give me a number");
      a[i]=sc.nextInt();
    }
    
    for(int i=0;i<a.length;i++)
    {
      int counter = 0;
      for(int j=i;j<a.length;j++)
      {
        if(a[i] == a[j])
        {
          counter++;
        }
      }
      if(counter >=2 && counter < 5)
      {
        System.out.println(a[i]);
      }
    }
    sc.close();
  }
}