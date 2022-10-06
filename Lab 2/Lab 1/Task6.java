import java.util.Scanner;
public class Task6
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me the value of n");
    int n= sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      if(i%2!=0)
      {
        sum=sum+(i*i);
      }
      else
      {
        sum=sum-(i*i);
      }
    }
    System.out.println(sum);
    sc.close();
  }
}