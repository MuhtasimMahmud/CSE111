import java.util.Scanner;
public class Task9
{
  public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please give me a word");
    String word = sc.nextLine();
    mg m =new mg(word);
    System.out.println(m.toUperCase());
    sc.close();
  }
}