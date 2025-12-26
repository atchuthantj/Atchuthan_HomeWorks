import java.util.Scanner;

public class RailwayTicketClass 
{
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter seat type:");
        System.out.println("1 -> General");
        System.out.println("2 -> Sleeper");
        System.out.println("3 -> AC 3 Tier");
        System.out.println("4 -> AC 2 Tier");
        System.out.println("5 -> First Class");

        int seatType = sc.nextInt();

        switch (seatType) 
		{
            case 1:
                System.out.println("Class: General");
                System.out.println("Ticket Rate: Rs. 150");
                break;

            case 2:
                System.out.println("Class: Sleeper");
                System.out.println("Ticket Rate: Rs. 350");
                break;

            case 3:
                System.out.println("Class: AC 3 Tier");
                System.out.println("Ticket Rate: Rs. 750");
                break;

            case 4:
                System.out.println("Class: AC 2 Tier");
                System.out.println("Ticket Rate: Rs. 1200");
                break;

            case 5:
                System.out.println("Class: First Class");
                System.out.println("Ticket Rate: Rs. 2000");
                break;

            default:
                System.out.println("Invalid seat type");
        }

        sc.close();
    }
}