import java.util.Scanner;
class GradeEva
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your grade from A to F  :");
		char value=sc.next().charAt(0);
		
		switch(value)
		{
		case 'A':
		System.out.println("Distinction");
		break;
		
		case 'B':
        System.out.println("Good");
		break;
		
		case 'c':
		System.out.println("Average");
		break;
		
		case 'D':
		System.out.println("Average");
		break;
		
		case 'E':
		System.out.println(" Below Average");
		break;
		
		case 'F':
		System.out.println("Bad");
		break;
		
		default:
		System.out.println("Enter the correct value");
		
		}
		
	}
}