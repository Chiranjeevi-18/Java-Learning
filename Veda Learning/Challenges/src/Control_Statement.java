package Challenges.src;
import java.util.Scanner;

public class Control_Statement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Accept a single integer number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Step 2: Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Step 3: Use switch to display day of the week
        System.out.println("Day of the week based on the number:");
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }

        // Step 4: Print first N even numbers using for loop
        System.out.println("First " + number + " even numbers:");
        for (int i = 1; i <= number; i++) {
            System.out.print((2 * i) + " ");
        }
        System.out.println();

        // Step 5: Calculate factorial using while loop
        int n = number;
        long factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Step 6: Calculate sum of digits using do-while loop
        int temp = Math.abs(number); // Make sure it's positive for digit sum
        int sum = 0;
        do {
            sum += temp % 10;
            temp /= 10;
        } while (temp > 0);
        System.out.println("Sum of digits of " + number + " is: " + sum);

        scanner.close();
    }
}
