public class A
{
  char [] ch;
  public A(String x)
  {
    ch = x.toCharArray();
  }
  public boolean startsWith(String y)
  {
    boolean b = true;
    if(y.length() <= ch.length)
    {
      for(int i = 0 ; i<y.length();i++)
      {
        if(ch[i]==y.charAt(i))
        {
          b = true;
        }
        else
        {
          b = false;
          break;
        }
      }
    }
    else
    {
      b = false;
    }
    return b;
  }
}