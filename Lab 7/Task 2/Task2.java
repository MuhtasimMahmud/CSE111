import java.util.Scanner;
public class Task2
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me a word");
    String word = sc.nextLine();
    System.out.println("Please give me a position");
    int position = sc.nextInt();
    if(position >= 0 && position < word.length())
    {
      System.out.println(word.charAt(position));
    }
    else 
    {
      System.out.println("Invalid index");
    }
    sc.close();
  }
}