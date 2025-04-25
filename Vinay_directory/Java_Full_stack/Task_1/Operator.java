package Java_Full_stack.Task_1;

import java.util.Scanner;
    public class Operator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int first = scanner.nextInt();
            System.out.print("Enter second number: ");
            int second = scanner.nextInt();
            System.out.print("Enter decimal number: ");
            double decimalNumber = scanner.nextDouble();
            System.out.println("\nBefore Swapping: First = " + first + ", Second = " + second);
            first = first + second;
            second = first - second;
            first = first - second;
            System.out.println("After Swapping: First = " + first + ", Second = " + second);
            int largest = Math.max(first, second);
            System.out.println("Largest JavaSyntaxAndBasics.Number = " + largest);
            int convertedDecimal = (int) decimalNumber;
            System.out.println("Decimal JavaSyntaxAndBasics.Number as Integer = " + convertedDecimal);
            first++;
            second--;
            System.out.println("Incremented First JavaSyntaxAndBasics.Number = " + first);
            System.out.println("Decremented Second JavaSyntaxAndBasics.Number = " + second);
            int bitwiseAnd = first & second;
            System.out.printf("Bitwise AND of First and Second JavaSyntaxAndBasics.Number = %02d\n", bitwiseAnd);

            scanner.close();
        }
    }
