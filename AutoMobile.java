class AutoMobile
{
	public static void main(String[] args)
	{
		int purchaserate=750;
		int commision=15;
		int sellingrate=purchaserate*commision/100;
		int gained =sellingrate+purchaserate;
		
		System.out.println("selling rate :"+gained);
	}
}