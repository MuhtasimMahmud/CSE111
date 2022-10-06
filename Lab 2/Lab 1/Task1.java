import java.util.Scanner;
public class Task1
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);
    int array [] = new int[10];
    for(int i=0;i<array.length ; i++)
    {
      int x = sc.nextInt();
      array[i]=x;
    }
    for (int i=array .length-1 ; i>=0 ;i--)
    {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    sc.close();
  }
}