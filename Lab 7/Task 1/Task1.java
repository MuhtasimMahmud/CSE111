import java.util.Scanner;
public class Task1
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me a word");
    String word = sc.nextLine();
    System.out.println(word.length());
    sc.close();
  }
}