class SchoolBooks
{
	public static void main(String[] args)
	{
		int containing=1800;
		int maths=40;
		int english=20;
		int science=30;
		int social=10;
		
		int mathsbook =containing*maths/100;
		int englishbook =containing*english/100;
		int sciencebook =containing*science/100;
		int socialbook =containing*social/100;
		
		System.out.println("Maths book :"+mathsbook);
		System.out.println("English book :"+englishbook);
		System.out.println("Science book :"+sciencebook);
		System.out.println("Social book :"+socialbook);
		System.out.println("Total Books :"+ (mathsbook+englishbook+sciencebook+socialbook));
		
	}
}