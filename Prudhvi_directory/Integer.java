import java.util.Scanner;

public class Integer
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter decimal number: ");
        double decimalNumber = scanner.nextDouble();
        System.out.println("\nYou entered:");
        System.out.println("First Integer: " + firstNumber);
        System.out.println("Second Integer: " + secondNumber);
        System.out.println("Decimal Number: " + decimalNumber);
    }
}
