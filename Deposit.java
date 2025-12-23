class Deposit
{
	public static void main(String[] args)
	{
		int depo=25000;
		int r=7;
		int t=4;
		
		int si=(depo*r*t)/100;
		int total=depo+si;
		
		System.out.println("the total value after 4 years is :"+total);
	}
}