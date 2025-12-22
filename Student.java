class Student
{
	public static void main(String[] args)
	{
		int marks=85;
		boolean attendance =true;
		boolean disipline=true;
		
		
		System.out.println("pass and eligible for scholarship :"+(attendance&&disipline&&marks<=85));
	}
}