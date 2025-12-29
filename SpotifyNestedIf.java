import java.util.Scanner;

class SpotifyNestedIf {
    public static void main(String[] args)  
	
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("SPOTIFY WELCOMES YOU");
        System.out.println("Select Artist:");
        System.out.println("1. A.R. Rahman");
        System.out.println("2. Anirudh");
        System.out.println("3. Harish Jeyaraj");
        System.out.println("4. Ilaiyaraja");
        System.out.println("5. U1");

        int artist = sc.nextInt();

        if (artist == 1) 
		
		{
            System.out.println("A.R. RAHMAN");
            System.out.println("1. Melody  2. Kuthu  3. Motivational  4. Sad");
            int type = sc.nextInt();

            if (type == 1) 
			{
                System.out.println("Playing: Ennavale Adi Ennavale");
            } else if (type == 2) {
                System.out.println("Playing: Urvashi Urvashi");
            } else if (type == 3) {
                System.out.println("Playing: Vande Mataram");
            } else if (type == 4) {
                System.out.println("Playing: Poongatrile");
            } else {
                System.out.println("Invalid Option");
            }

        } 
		else if (artist == 2) 
		{
            System.out.println("ANIRUDH");
            System.out.println("1. Melody  2. Kuthu  3. Motivational  4. Sad");
            int type = sc.nextInt();

            if (type == 1) 
			
			{
                System.out.println("Playing: Neeyum Nanum Anbe");
            } 
			else if (type == 2) 
			{
                System.out.println("Playing: Vaathi Raid");
            } 
			
			else if (type == 3) 
			{
                System.out.println("Playing: Ethir Neechal");
            } 
			else if (type == 4) 
			{
                System.out.println("Playing: Kanave Kanave");
            } else {
                System.out.println("Invalid Option");
            }

        } 
		else if (artist == 3) 
		{
            System.out.println("HARISH JEYARAJ");
            System.out.println("1. Melody  2. Kuthu  3. Sad");
            int type = sc.nextInt();

            if (type == 1) 
			{
                System.out.println("Playing: Vaseegara");
            } 
			else if (type == 2) 
			{
                System.out.println("Playing: Tirunelveli Halwa Da");
            } 
			else if (type == 3) 
			{
                System.out.println("Playing: Venmathiye");
            } 
			else 
			{
                System.out.println("Invalid Option");
            }

        } else if (artist == 4) 
		{
            System.out.println("ILAIYARAJA");
            System.out.println("1. Melody  2. Kuthu  3. Sad");
            int type = sc.nextInt();

            if (type == 1) 
			{
                System.out.println("Playing: Oru Kili Uruguthu");
            } 
			else if (type == 2) 
			{
                System.out.println("Playing: Ooruvittu Ooruvanthu");
            } 
			else if (type == 3) 
			{
                System.out.println("Playing: Kanne Kalaimane");
            }
			else {
                System.out.println("Invalid Option");
            }

        } 
		else if (artist == 5) 
		{
            System.out.println("U1");
            System.out.println("1. Melody  2. Kuthu  3. Motivational  4. Sad");
            int type = sc.nextInt();

            if (type == 1) 
			{
                System.out.println("Playing: Venmegam");
            }
			else if (type == 2) 
			{
                System.out.println("Playing: Machi Open the Bottle");
            } 
			else if (type == 3) {
                System.out.println("Playing: Oru Naalil");
            } 
			else if (type == 4) {
                System.out.println("Playing: Pogadhe");
            } 
			else
			{
                System.out.println("Invalid Option");
            }

        }
		else 
		{
            System.out.println("Invalid Artist Selection");
        }

        
    }
}