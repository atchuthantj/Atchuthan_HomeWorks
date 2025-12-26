import java.util.Scanner;
class Month
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Month in numbers : ");
		int month=sc.nextInt();
		
		switch(month)
		{
		case 1:
		System.out.println("1st month is january which contains 31 days");
		break;
		
		case 2:
		System.out.println("2nd month is february which contains 29 or 28 days");
		break;
		
		case 3:
		System.out.println("3rd month is march which contains 31 days");
		break;
		
		case 4:
		System.out.println("4th month is april which contains 30 days");
		break;
		
		case 5:
		System.out.println("5th month is may which contains 31 days");
		break;
		
		case 6:
		System.out.println("6th month is june which contains 30 days");
		break;
		
		case 7:
		System.out.println("7th month is july which contains 31 days");
		break;
		
		case 8:
		System.out.println("8th month is August which contains 31 days");
		break;
		
		case 9:
		System.out.println("9th month is september which contains 30 days");
		break;
		
		case 10:
		System.out.println("10th month is october which contains 31 days");
		break;
		
		case 11:
		System.out.println("11th month is November which contains 30 days");
		break;
		
		case 12:
		System.out.println("12th month is december which contains 31 days");
		break;
		
		default:
		System.out.println("choose between 1 to 12");
		
		
		}
	}
}