import java.util.Scanner;

class WorldOfKnowledge 
{
    public static void main(String[] args)
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("THE WORLD OF KNOWLEDGE");
        System.out.println("Select Category:");
        System.out.println("1. Fiction");
        System.out.println("2. Fantasy");
        System.out.println("3. Business");
        System.out.println("4. Psychology");

        int category = sc.nextInt();

        if (category == 1) 
		{
            System.out.println("FICTION");
            System.out.println("1. Rise of the Fallen");
            System.out.println("2. Shadows Rising");
            System.out.println("3. It Ends With Us");

            int book = sc.nextInt();

            if (book == 1) 
			{
                System.out.println("Rise of the Fallen");
                System.out.println("Author: Abhishek Krishnan");
                System.out.println("Rate: Rs.300");
            } 
			else if (book == 2) 
			{
                System.out.println("Shadows Rising");
                System.out.println("Author: Rohan Monteiro");
                System.out.println("Rate: Rs.250");
            }
			else if (book == 3) 
			{
                System.out.println("It Ends With Us");
                System.out.println("Author: Colleen Hoover");
                System.out.println("Rate: Rs.350");
            } 
			else 
			{
                System.out.println("Invalid Book Choice");
            }

        } 
		else if (category == 2) 
		{
            System.out.println("FANTASY");
            System.out.println("1. Compass and Blade");
            System.out.println("2. Blood Metal Bone");
            System.out.println("3. The Shadows Between Us");

            int book = sc.nextInt();

            if (book == 1) 
			{
                System.out.println("Compass and Blade");
                System.out.println("Rate: Rs.370");
            } 
			else if (book == 2)
				{
                System.out.println("Blood Metal Bone");
                System.out.println("Rate: Rs.275");
            } 
			else if (book == 3) 
			{
                System.out.println("The Shadows Between Us");
                System.out.println("Rate: Rs.304");
            } 
			else 
			{
                System.out.println("Invalid Book Choice");
            }

        } 
		else if (category == 3) 
		{
            System.out.println("BUSINESS");
            System.out.println("1. The Psychology of Money");
            System.out.println("2. Do It Today");
            System.out.println("3. Atomic Habits");

            int book = sc.nextInt();

            if (book == 1) 
			{
                System.out.println("The Psychology of Money");
                System.out.println("Rate: Rs.300");
            } 
			else if (book == 2) 
			{
                System.out.println("Do It Today");
                System.out.println("Rate: Rs.100");
            }
			else if (book == 3) 
			{
                System.out.println("Atomic Habits");
                System.out.println("Rate: Rs.350");
            }
			else 
			{
                System.out.println("Invalid Book Choice");
            }

        } 
		else if (category == 4)
			{
            System.out.println("PSYCHOLOGY");
            System.out.println("1. Dark Psychology Secrets");
            System.out.println("2. Power of Subconscious Mind");
            System.out.println("3. The Courage to Be Disliked");

            int book = sc.nextInt();

            if (book == 1) 
			{
                System.out.println("Dark Psychology Secrets");
                System.out.println("Rate: Rs.300");
            } 
			else if (book == 2) 
			{
                System.out.println("Power of Subconscious Mind");
                System.out.println("Rate: Rs.100");
            }
			else if (book == 3) 
			{
                System.out.println("The Courage to Be Disliked");
                System.out.println("Rate: Rs.350");
            } 
			else 
			{
                System.out.println("Invalid Book Choice");
            }

        }
		else {
            System.out.println("Invalid Category Selection");
        }

       
    }
}