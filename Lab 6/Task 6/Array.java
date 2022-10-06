import java.util.Scanner;
public class Array
{
  Scanner sc = new Scanner(System.in);
  public Array()
  {
    //default
  }
  public void arrayMaker(int length)
  {
    int array[] = new int[length];
    System.out.println("\nNow give me the array inputs respectively\n");
    int counter=0;
    for(int i = 0;i<array.length;i++)
    {
      array [i] = sc.nextInt();
      if(array [i]>0)
      {
        counter++;
      }
    }
    int array2[] = new int[counter];
    int k=0;
    for(int  i=0;i<array.length;i++)
    {
      if(array[i]>0)
      {
        array2[k++]=array[i];
      }
    }
    for(int i=0;i<array2.length;i++)
    {
      System.out.println(array2[i]);
    }
  }
}