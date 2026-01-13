import java.util.Scanner;

class CountNumbersMenu 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int choice, i;
        boolean entered = false;

        do 
		{
            System.out.println("\n--- MENU ---");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Count Positive Numbers");
            System.out.println("4. Count Negative Numbers");
            System.out.println("5. Count Zeros");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    System.out.println("Enter 10 numbers:");
                    for (i = 0; i < 10; i++) 
					{
                        arr[i] = sc.nextInt();
                    }
                    entered = true;
                    break;

                case 2:
                    if (!entered) 
					{
                        System.out.println("Please enter numbers first.");
                    } 
					else 
					{
                        System.out.println("Array elements:");
                        for (i = 0; i < 10; i++) 
						{
                            System.out.print(arr[i] + " ");
                        }
                    }
                    break;

                case 3:
                    if (!entered) 
					{
                        System.out.println("Please enter numbers first.");
                    }
					else 
					{
                        int positive = 0;
                        for (i = 0; i < 10; i++) 
						{
                            if (arr[i] > 0)
                                positive++;
                        }
                        System.out.println("Positive numbers count = " + positive);
                    }
                    break;

                case 4:
                    if (!entered) 
					{
                        System.out.println("Please enter numbers first.");
                    } else {
                        int negative = 0;
                        for (i = 0; i < 10; i++) 
						{
                            if (arr[i] < 0)
                                negative++;
                        }
                        System.out.println("Negative numbers count = " + negative);
                    }
                    break;

                case 5:
                    if (!entered) 
					{
                        System.out.println("Please enter numbers first.");
                    } 
					else 
					{
                        int zero = 0;
                        for (i = 0; i < 10; i++) 
						{
                            if (arr[i] == 0)
                                zero++;
                        }
                        System.out.println("Zero count = " + zero);
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } 
		while (choice != 6);

        
    }
}