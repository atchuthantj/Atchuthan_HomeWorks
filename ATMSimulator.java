class ATMSimulator 
{
    public static void main(String[] args) 
	{

        double balance = 5000.75;   
        float withdraw = 1250.50f;  

       
        int wrongWithdraw = (int) withdraw;  
        double wrongBalance = balance - wrongWithdraw;

        System.out.println("Wrong Casting Balance = " + wrongBalance);

      
        int correctWithdraw = (int) Math.round(withdraw);
        double correctBalance = balance - correctWithdraw;

        System.out.println("Correct Casting Balance = " + correctBalance);
    }
}