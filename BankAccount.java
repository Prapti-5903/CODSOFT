public class BankAccount 
{
    private double balance;
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } 
        else 
        {
            System.out.println("Insufficient balance.");
        }
    }
}

