package oops.encapsulation;

public class Banking {
  private String accountHolderName;
  private final String accountNumber;
  private double balance;

  public Banking(String accountHolderName,String accountNumber,double  balance)
  {
      this.accountHolderName=accountHolderName;
      this.accountNumber=accountNumber;
      this.balance=balance;
  }
  //getter
  public String getAccountHolderName()
  {
      return this.accountHolderName;
  }
  //setter
    public void setAccountHolderName(String name)
    {
        if(name!=null && !name.isEmpty())
        {
            this.accountHolderName=name;
        }
        else {
            System.out.println("Invalid Name");
        }
    }
    //getter for account number
      public String getAccountNumber()
      {
        return this.accountNumber;
      }
   //getter for balance
      public double getBalance()
     {
        return this.balance;
     }
   // for balance

    public void deposit(double amount)
    {
       if(amount>0)
       {
           balance=balance+amount;
       }
    }
    public void withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance=balance-amount;
        }
    }


}
