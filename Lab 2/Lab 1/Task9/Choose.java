public class Choose
{
  public Choose()
  {
    //default constructor
  }
  public void Odd(int []a)
  {
    for(int i=0;i<a.length;i=i+2)
    {
      int min = i;
      for(int j=i+2;j<a.length;j=j+2)
      {
        if(a[j] < a[min])
        {
          min = j;
        }
      }
      int temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i] + " ");
    } 
  }
  public void Even(int a[])
  {
    for(int i=1;i<a.length;i=i+2)
    {
      int min = i;
      for(int j=i+2;j<a.length;j=j+2)
      {
        if(a[j] < a[min])
        {
          min = j;
        }
      }
      int temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i] + " ");
    }
  }
  public void All(int a[])
  {
    for(int i=0;i<a.length;i++)
    {
      int min = i;
      for(int j=i+1;j<a.length;j++)
      {
        if(a[j] < a[min])
        {
          min = j;
        }
      }
      int temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i] + " ");
    }
  }
}