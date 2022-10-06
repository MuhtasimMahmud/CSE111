public class mg
{
  char [] ch;
  public mg(String x)
  {
    ch = x.toCharArray();
  }
  public boolean endsWith(String y)
  {
    boolean b = true;
    int j = ch.length-1;
    for(int i =y.length()-1; i>=0 ;i-- )
    {
      if(y.charAt(i) == ch[j--])
      {
        b= true;
      }
      else
      {
        b = false;
      }
    }
    return b;
  }
}