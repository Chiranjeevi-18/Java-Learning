public class Arithmetic
{
        public static void main(String[] args)
        {
            int a = 10;
            int b = 5;
            System.out.println("Before Swap:");
            System.out.println("a = " + a + ", b = " + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("\nAfter Swap using Arithmetic:");
            System.out.println("a = " + a + ", b = " + b);
            a = 10;
            b = 5;
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("\nAfter Swap using Bitwise XOR:");
            System.out.println("a = " + a + ", b = " + b);
        }
    }

