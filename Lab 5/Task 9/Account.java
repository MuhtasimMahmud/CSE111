public class Account
{ 
  public static double interestRate = 5;
  private String name = "Default Account";
  private double balance =0.0;
  
  public Account()
  {
    //default
  }
  public Account(String name , double balance)
  {
    this.name = name;
    this.balance = balance;
  }
  
  public String nameKi()
  {
    return this.name;
  }
  public void nameBoshao(String name)
  {
    this.name = name;
  }
  public double balanceKi()
  {
    return balance;
  }
  public void balanceBoshao(double balance)
  {
    this.balance = balance;
  }
  public void withdraw(int x)
  {
    double y = this.balance-x;
    if(y >= 101.0)
    {
      System.out.println("Withdraw successful ! New balance is :"+y);
    }
    else
    {
      System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
    }
  }
}