import java.util.Scanner;
public class Task5
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me a word");
    String word = sc.nextLine();
    char a [] = word.toCharArray();
    int b [] = new int[a.length];
    int j = 0;
    for(int i = 0;i<a.length;i++)
    {
      b[j++]=((int)a[i]);
    }
    for(int i =0;i<b.length;i++)
    {
      int max = i;
      for(int k=i+1;k<b.length;k++)
      {
        if(a[k]>max)
        {
          max = k;
        }
      }
      int temp = b[i];
      b[i]=b[max];
      b[max]=temp;
    }
    System.out.println((char)b[1]);
    sc.close();
  }
}