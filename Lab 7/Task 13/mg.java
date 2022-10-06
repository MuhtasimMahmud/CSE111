public class mg
{
  char [] ch;
  public mg(String x)
  {
    ch = x.toCharArray();
  }
  public int compareToIgnoreCase(String y)
  {
    int dif =0;
    if(ch.length == y.length())
    {
      for(int i =0;i<ch.length;i++)
      {
        if((int)ch[i]==(int)y.charAt(i))
        {
          dif =0;
        }
        else
        {
          if((int)ch[i]>(int)y.charAt(i))
          {
            dif = (int)y.charAt(i)-(int)ch[i];
          }
          else if((int)ch[i]<(int)y.charAt(i))
          {
            dif =(int)y.charAt(i)-(int)ch[i];
          }
          break;
          }
        }
      }
    else
    {
      System.out.println("length is not equal");
    }
    return dif;
  }
}