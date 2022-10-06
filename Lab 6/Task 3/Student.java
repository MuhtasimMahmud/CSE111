public class Student 
{
  private String name = "Ei name e kuno student nai";
  private String id = "Student e nai , abar id :p";
  private String address = "Nam nai .. thikana ashbe koi theke ?";
  private double cgpa = -4.0 ;
  public Student()
  {
    //default 
  }
  public Student (String name , String id , String address , double cgpa )
  {
    this.name = name;
    this.id = id;
    this.address = address;
    this.cgpa = cgpa;
  }
  public String nameDao()
  {
    return name;
  }
  public String boloToAmiKe()
  {
    return id;
  }
  public String addressDao()
  {
    return address;
  }
  public double cgpaDao()
  {
    return cgpa;
  }
  public void nameBoshao(String name)
  {
    this.name = name;
  }
  public void idBoshao(String id)
  {
    this.id = id;
  }
  public void addressBoshao(String address)
  {
    this.address = address;
  }
  public void cgpaBoshao(double cgpa)
  {
    this.cgpa = cgpa;
  }
  public void standUp()
  {
    System.out.println(this.name+" is standing up !!");
  }
  public String tellMeYourName()
  {
    return "Sir , my name is "+this.name;
  }
  public void call(String n)
  {
    System.out.println(this.name+" : Hey ,"+ n +" , Sir is calling you!!");
  }
  public int add2Numbers(int x, int y)
  {
    return (x+y);
  }
}