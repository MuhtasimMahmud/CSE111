public class mg
{
  char [] ch;
  public mg(String x)
  {
    ch = x.toCharArray();
  }
  public boolean equalsIgnoreCase(String y)
  {
    boolean b = true;
    if(ch.length == y.length())
    {
      for(int i =0;i<ch.length;i++)
      {
        if((char)ch[i]==y.charAt(i) || (char)(ch[i]-32)==y.charAt(i) || (char)(ch[i]+32)==y.charAt(i))
        {
          b=true;
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