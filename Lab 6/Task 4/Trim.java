public class Trim
{
  public static char[]  trim (char[]input)
  {
    char previous= ' ';
    int j = 0;
    char [] a = new char [input.length] ;
    for(int i = 0; i<input.length ;i++)
    {
      char current = input[i];
      if(previous == ' ' && current ==' ')
      { 
        continue;
      }
      else
      {
        a[j++]=input[i];
      }
      previous = current;
    }
    return a;
  }
  public static void main(String [] args)
  {
    char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
    for (int i = 0; i< input.length; i++)
    {
      System.out.print(input[i]);
    }
    System.out.println("");
    char []  output = trim(input);
    for (int i = 0; i< output.length; i++)
    {
      System.out.print(output[i]);
    }
    System.out.println("");    
  }
}
