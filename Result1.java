import java.util.Scanner;

class Result1
{

    int a = 50, b = 60, c = 70; 

    int total() 
	{
        return a + b + c;
    }

    float percentage() 
	{
        return total() / 3f;
    }

    String result() 
	{
        if (percentage() >= 40)
		{
            return "PASS";
		}
        else
		{
            return "FAIL";
		}
    }

    String displayGrade() 
	{
        float p = percentage();

        if (p >= 75)
		{
            return "A";
		}
        else if (p >= 60)
		{
            return "B";
		}
        else if (p >= 40)
		{
            return "C";
		}
        else
		{
            return "F";
		}
    }

    public static void main(String[] args) 
	{

        Result1 r = new Result1();   
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.println("Total = " + r.total());
                    break;
                case 2:
                    System.out.println("Percentage = " + r.percentage());
                    break;
                case 3:
                    System.out.println("Result = " + r.result());
                    break;
                case 4:
                    System.out.println("Grade = " + r.displayGrade());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
		while (choice != 5);
    }
}

