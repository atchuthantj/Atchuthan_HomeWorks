class NumberOfBoys
{
	public static void main(String[] args)
	{
		int students=50;
		int girlspercent=40;
		int girls=students*girlspercent/100;
		int girlscount=students-girls;
		int boyscount=students-girlscount;
		
		System.out.println("the girls count is :"+girlscount);
		System.out.println("the boys count is :"+boyscount);
	}
}