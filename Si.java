class Si
{
	public static void main(String[] args)
	{
		int deposit=50000;
		int percent=6;
		int years=5;
		
		int si=(deposit*percent*years)/100;
		int total=deposit+si;
		
		System.out.println("The interest for 5 years amount is :"+si);
		System.out.println("The total balance after 5 years :"+total);
	}
}