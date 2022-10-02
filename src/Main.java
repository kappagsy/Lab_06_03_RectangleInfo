import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int length = 0;
        int width = 0;
        int perimeter = 0;
        int area = 0;
        int lengthSquared = 0;
        int widthSquared = 0;
        int addedSquares = 0;
        double diagonal = 0;
        String trash = "";

        System.out.print("What is the length of the rectangle? ");
        if(in.hasNextInt())
        {
        length = in.nextInt();
        in.nextLine();
        }
        else
        {
            trash = in.next();
            System.out.println(trash + " is an invalid input.");
        }
        System.out.print("What is the width of the rectangle? ");
        if(in.hasNextInt())
        {
            width = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.next();
            System.out.println(trash + " is an invalid input.");
        }
        perimeter = (2 * length)+(2 * width);
        area = length * width;
        lengthSquared = (int) Math.pow(length, 2);
        widthSquared = (int) Math.pow(width, 2);
        addedSquares = lengthSquared + widthSquared;
        diagonal = java.lang.Math.sqrt(addedSquares);
        System.out.println("The perimeter of this rectangle is: " + perimeter + " units.");
        System.out.println("The area of this rectangle is: " + area + " square units.");
        System.out.println("The diagonal of this rectangle is: " + diagonal);
        System.exit(0);

    }
}