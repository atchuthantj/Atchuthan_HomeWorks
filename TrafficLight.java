import java.util.Scanner;
class TrafficLight
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("choose traffic light color Red or Yellow or Green :");
		String light=sc.nextLine();
		
		switch(light)
		{
			case "Red": case "red":
			System.out.println("Red means Stop");
			break;
			
			case "Yellow": case "yellow":
			System.out.println("Yellow means Ready");
			break;
			
			case "Green": case "green":
			System.out.println("Green means Go");
			break;
			
			default:
			System.out.println("choose your correct colour");
		}	
	
	}
}	