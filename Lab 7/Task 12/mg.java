public class mg
{
  char [] ch;
  public mg(String x)
  {
    ch = x.toCharArray();
  }
  public int compareTo(String y)
  {
    int dif =0;
    if(ch.length == y.length())
    {
      for(int i =0;i<ch.length;i++)
      {
        if((char)ch[i]==y.charAt(i))
        {
          dif =0;
        }
        else
        {
          if( (int)ch[i]<=90 && y.charAt(i)<=90  ||  (int)ch[i]>=97 && y.charAt(i)>=97)
          {
          if((int)ch[i]>(int)y.charAt(i))
          {
            dif = (int)y.charAt(i)-(int)ch[i];
          }
          else
          {
            dif = (int)y.charAt(i)-(int)ch[i];;
          }
          break;
          }
          else
          {
            System.out.println("Case is different");
            break;
          }
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