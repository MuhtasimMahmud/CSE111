public class Student 
{
  private String name =  "";
  private String id = "";
  private String address = "";
  private double cgpa =0.0 ;
  
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }
  public void setId(String id)
  {
    this.id = id;
  }
  public String getId()
  {
    return id;
  }
  public void setAddress(String address)
  {
    this.address = address;
  }
  public String getAddress()
  {
    return address;
  }
  public void setCgpa(double cgpa)
  {
    this.cgpa = cgpa;
  }
  public double getCgpa()
  {
    return cgpa;
  }
}