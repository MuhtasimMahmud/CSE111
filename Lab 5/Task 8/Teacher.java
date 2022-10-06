public class Teacher
{
  private String name = "";
  private String department = "";
  private String x="";
  public Teacher(String name , String department)
  {
    this.name = name;
    this.department = department;
  }
  public void addCourse(Course c)
  {
     x = x +"\n"+ c.course;
  }
  public void printDetail()
  {
    System.out.println("========================");
    System.out.println("Name : "+ this.name);
    System.out.println("Department : "+ this.department);
    System.out.println("List of courses ");
    System.out.println("========================");
    System.out.println(x);
    System.out.println("========================");
  }
}