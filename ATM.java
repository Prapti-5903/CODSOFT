import java.util.Scanner;
public class ATM 
{
    private BankAccount account;
    public ATM(BankAccount account) 
    {
        this.account = account;
    }
    public void showMenu() 
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do 
        {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
        while (choice != 4);
        scanner.close();
    }
    private void checkBalance() 
    {
        System.out.println("Current balance: " + account.getBalance());
    }
    private void deposit(Scanner scanner) 
    {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }
    private void withdraw(Scanner scanner) 
    {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }
        public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 
        ATM atm = new ATM(account);
        atm.showMenu();
    }
}

