class EMICalculator 
{
    public static void main(String[] args) 
	{

        long principal = 100000;      
        float rate = 10.5f;           
        int time = 2;                 

        
        float interest = principal * rate * time / 100;
        float totalAmount = principal + interest;
        float emi = totalAmount / (time * 12);

        System.out.println("Using Implicit Casting:");
        System.out.println("EMI = " + emi);

       
        float interest2 = (float) principal * rate * time / 100;
        float totalAmount2 = (float) principal + interest2;
        float emi2 = totalAmount2 / (time * 12);

        System.out.println("\nUsing Explicit Casting:");
        System.out.println("EMI = " + emi2);

       
        int wrongInterest = (int) (principal * rate * time / 100);
        int wrongTotal = (int) principal + wrongInterest;
        int wrongEmi = wrongTotal / (time * 12);

        System.out.println("\nUsing Wrong Casting:");
        System.out.println("EMI = " + wrongEmi);
    }
}