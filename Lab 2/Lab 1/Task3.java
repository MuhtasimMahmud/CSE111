import java.util.Scanner;
public class Task3
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int a []= new int [10];
    for(int i=0; i<a.length; i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
      int min = i;
      for(int j=i+1; j<a.length ;j++)
      {
        if(a[j] < a[min])
        {
          min = j;
        }
      }
      int temp= a[i];
      a[i] = a[min];
      a[min] = temp;
    }
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
    sc.close();
  }
}