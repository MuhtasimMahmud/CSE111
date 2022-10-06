public class CheckingAccount extends Account
{
  static int numberOfAccount = 0;
  public CheckingAccount()
  {
    //default
    super(0.0);
    numberOfAccount++;
  }
  public CheckingAccount(double b)
  {
    super(b);
    numberOfAccount++;
  }
}