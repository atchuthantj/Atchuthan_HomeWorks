import java.util.Scanner;

public class StudentListArray 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();

        String[] students = new String[n];
        int count = 0;  
        int choice;

        
        do {
            
            System.out.println("1. Add Students");
            System.out.println("2. See Student List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) 
			{

                case 1:
                    if (count < n) {
                        System.out.print("Enter student name: ");
                        students[count] = sc.next();
                        count++;
                        System.out.println("Student added successfully!");
                    } 
					else 
					{
                        System.out.println("Student list is full!");
                    }
                    break;

                case 2:
                    if (count == 0) 
					{
                        System.out.println("No students added yet!");
                    } 
					else 
					{
                        System.out.println("Student List:");
                        for (int i = 0; i < count; i++) 
						{
                            System.out.println((i + 1) + ". " + students[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program exited. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        }
		while (choice != 3);

        
    }
}