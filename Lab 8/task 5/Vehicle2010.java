public class Vehicle2010 extends Vehicle
{
  public Vehicle2010()
  {
    super();
  }
  public void moveUpperRight()
  {
    moveUp();
    moveRight();
  }
  public void moveUpperLeft()
  {
    moveUp();
    moveLeft();
  }
  public void moveLowerRight()
  {
    moveDown();
    moveRight();
  }
  public void moveLowerLeft()
  {
    moveDown();
    moveLeft();
  }
  public String toString()
  {
    return "("+x+","+y+")";
  }
  public boolean equals(Vehicle2010 v)
  {
    boolean b = true;
    if(v.x == this.x && v.y == this.y)
    {
      b = true;
    }
    else
    {
      b = false;
    }
    return b;
  }
}