import java.util.Scanner;

class Bank 
{

    int balance;   

    int deposit(int amt) 
	{
        balance = balance + amt;
        return balance;
    }

    int withdraw(int amt) 
	{
        if (amt <= balance) 
		{
            balance = balance - amt;
        }
		else 
		{
            System.out.println("Insufficient Balance");
        }
        return balance;
    }

    int checkBalance() 
	{
        return balance;
    }

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();   
        int choice, amt;

       
        System.out.print("Enter initial balance: ");
        b.balance = sc.nextInt();

        do 
		{
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.print("Enter deposit amount: ");
                    amt = sc.nextInt();
                    System.out.println("Balance = " + b.deposit(amt));
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    amt = sc.nextInt();
                    System.out.println("Balance = " + b.withdraw(amt));
                    break;

                case 3:
                    System.out.println("Balance = " + b.checkBalance());
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}