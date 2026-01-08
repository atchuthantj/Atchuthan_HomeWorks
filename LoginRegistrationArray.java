import java.util.Scanner;

public class LoginRegistrationArray 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        
        String[] usernames = new String[5];
        String[] passwords = new String[5];

        int count = 0;   
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1. Registration");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    if (count < usernames.length) 
					{
                        System.out.print("Enter username: ");
                        usernames[count] = sc.next();

                        System.out.print("Enter password: ");
                        passwords[count] = sc.next();

                        count++;
                        System.out.println("Registration successful!");
                    }
					else 
					{
                        System.out.println("User limit reached!");
                    }
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String uname = sc.next();

                    System.out.print("Enter password: ");
                    String pass = sc.next();

                    boolean loginSuccess = false;

                    for (int i = 0; i < count; i++) 
					{
                        if (usernames[i].equals(uname) && passwords[i].equals(pass)) 
						{
                            loginSuccess = true;
                            break;
                        }
                    }

                    if (loginSuccess) 
					{
                        System.out.println("Login successful!");
                    } 
					else 
					{
                        System.out.println("Invalid username or password!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } 
		while (choice != 3);

       
    }
}