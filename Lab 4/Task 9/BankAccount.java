public class BankAccount
{
  private String name = "";
  private String address = "";
  private String accountID = "";
  private double balance = 0.0;
  
  
  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }
  public void setAddress(String address)
  {
    this.address = address;
  }
  public String getAddress()
  {
    return address;
  }
  public void setAccountId(String id)
  {
    this.accountID = id;
  }
  public String getAccountId()
  {
    return accountID;
  }
  public void setBalance(double balance)
  {
    this.balance = balance;
  }
  public double getBalance()
  {
    return balance;
  }
  public double addInterest()
  {
    double x = this.balance + (this.balance*7)/100;
    return x;
  }
}