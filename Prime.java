import java.util.Scanner;

class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num == 2 || num == 3 || num == 5 || num == 7)
        {
            System.out.println(num + " is a Prime number");
        }
        else if (num <= 1 || num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0)
        {
            System.out.println(num + " is NOT a Prime number");
        }
        else
        {
            System.out.println(num + " is a Prime number");
        }

        
    }
}