public class Book
{
  private String title ="";
  private String author ="";
  private double price =0.0;
  
  public Book(String title , String author , double price )
  {
    setTitle(title);
    setAuthor(author);
    setPrice(price);
  }
  public void setTitle(String title)
  {
    this.title=title;
  }
  public  String getTitle()
  {
    return title;
  }
  public void setAuthor(String author)
  {
    this.author = author;
  }
  public String getAuthor()
  {
    return author;
  }
  public void setPrice(double price)
  {
     this.price = price;
  }
  public double getPrice()
  {
    return price;
  }
  public String toString()
  {
    return "Title :"+getTitle() +"\n"+"Autjor's name :"+getAuthor()+"\n"+"Price :"+getPrice();
  }
}