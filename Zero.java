import java.util.Scanner;

public class Zero
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter -2 to quit.\nEnter the numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = input.nextInt();
        
        while (numerator != -2 && denominator != -2)
        {
            try 
            {
                System.out.println("\n" + numerator + " divided by " + + denominator + " is: " + (double)(numerator/denominator) + "\n");
            }
            catch (ArithmeticException exception)
            {
                System.out.println("\nThe denominator being " + denominator + " makes the equation undefined. \nPlease reenter another numerator and denominator.\n");
            }
            System.out.print("Enter -2 to quit.\nEnter the numerator: ");
            numerator = input.nextInt();
            System.out.print("Enter the denominator: ");
            denominator = input.nextInt();
        }
        System.out.println("\nYou can no longer find the quotient of two numbers.\n");
   }
}
