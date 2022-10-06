public class mg
{
  char [] ch ;
  public mg(String x)
  {
    ch =  x.toCharArray();
  }
  public char [] toUperCase()
  {
    for(int i = 0;i<ch.length;i++)
    {
      if((int)ch[i]>90)
      {
        ch[i] = (char)((int)ch[i]-32);
      }
    }
    return ch;
  }
}