import java.util.Scanner;
public class Task6
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int a []=new int [10];
    for(int i=0;i<a.length;i++)
    {
      System.out.println("Please give me a number");
      int x = sc.nextInt();
      a[x]++;
    }
    for(int i=0;i<a.length;i++)
    {
      if(a[i]!=0)
      {
        System.out.println(i +" ache "+a[i]+" bar");
      }    
    }
    sc.close();
  }
}