public class mg
{
  char [] c;
  public mg()
  {
    //default constructor
  }
  public mg(String s)
  {
    c=s.toCharArray();
  }
  public char [] replaceFirst(String x,String y)
  {
    char [] a=x.toCharArray();
    char [] b=y.toCharArray();
    for(int i=0;i<c.length;i++)
    {
      if(c[i]==a[0])
      {
        c[i]=b[0];
        break;
      }
    }
    return c;
  }
  
}