public class Student
{
  private String name = "Default";
  public static int numberOfStudents = 0; 
  public Student()
  {
    //default
  }
  public Student(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    numberOfStudents++;
    return name;
  }
}