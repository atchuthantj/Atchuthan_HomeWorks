import java.util.Scanner;

public class ShapeAreaCalculator 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");

        int choice = sc.nextInt();

        switch (choice) 
		{

            case 1: // Circle
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of Circle = " + circleArea);
                break;

            case 2: // Square
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of Square = " + squareArea);
                break;

            case 3: // Rectangle
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of Rectangle = " + rectangleArea);
                break;

            case 4: // Triangle
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of Triangle = " + triangleArea);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}