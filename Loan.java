class Loan
{ 
 
   public static void main(String[] args)
    {

        int age = 25;           
        int monthlyIncome = 30000; 

        if (age > 21 && monthlyIncome >= 25000)
		{
            System.out.println("Eligible for loan");
        } 
		else 
		{
            
			System.out.println("Not eligible for loan");
        }
    }
}