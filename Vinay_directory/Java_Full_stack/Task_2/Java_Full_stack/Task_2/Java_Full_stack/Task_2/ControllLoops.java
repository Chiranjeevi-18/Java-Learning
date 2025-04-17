
import java.util.Scanner;

public class ControllLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int a= sc.nextInt();
        if (a>0) {
            System.out.println("number is positive");
        }
            else
            {
                System.out.println("number is negative");
            }
        switch (a) {
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
            case 8:
                System.out.println("This input is invalid");
        }
                for(int n=1;n<6;n++)
                {
                    System.out.println("first 5 even numbers:" + n*2);

                }
                int i=1;
                int Factorial=1;
                while(i<=a) {
                    Factorial *= i;
                    i++;
                }
                System.out.println("factorial of " + a + "is:" + Factorial);
                int x=a;
                int sum=0;
                do {
                    int y=a%10;
                    sum += y;
                    a /= 10;
                }while(a>0);
                System.out.println("Sum of integer"  + x + "=" + sum);

        }
    }