package ControlflowAndLoops;

import java.util.Scanner;

public class controlLoops
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number:");
        int a= sc.nextInt();
        if (a>0)
        {
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }
        switch (a){
            case 1:
                System.out.println("Day of the week:Monday");
                break;
            case 2:
                System.out.println("Day of the week:Tuesday");
                break;
            case 3:
                System.out.println("Day of the week:wednesday");
                break;
            case 4:
                System.out.println("Day of the week:Thursday");
                break;
            case 5:
                System.out.println("Day of the week:Friday");
                break;
            case 6:
                System.out.println("Day of the week:Saturday");
                break;
            case 7:
                System.out.println("Day of the week:Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

       for(int n=1;n<=a;n++)
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
