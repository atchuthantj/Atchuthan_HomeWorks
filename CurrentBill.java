import java.util.Scanner;
class CurrentBill
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter how much electricity units you consumed :");
	int units=sc.nextInt();
	
	if(units<=100&&units >=0)
	{
		System.out.println("your bill is :"+(units*5));
	}
	else if(units<=200&&units>=101)
	{
		System.out.println("your bill is :"+(units*7));
	}
	else if(units>200)
	{
		System.out.println("your bill is :"+(units*10));
	}
	else
	{
		System.out.println("enter the correct value");
	}
	}
}