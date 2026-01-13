class GameRankingSystem 
{
    public static void main(String[] args)
	{

        long score = 500;      
        double time = 3.0;     

        int wrongRank = (int) (score / time);
        System.out.println("Wrong Casting Rank Score = " + wrongRank);

        double correctRank = (double) score / time;
        System.out.println("Correct Casting Rank Score = " + correctRank);
    }
}
