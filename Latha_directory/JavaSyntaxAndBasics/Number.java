package JavaSyntaxAndBasics;

import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first Integer:");
        int num1= sc.nextInt();
        System.out.println("Enter the second Integer:");
        int num2= sc.nextInt();
        System.out.println("Enter the decimal number:");
        float num3= sc.nextFloat();
        System.out.println("before swap:");
        System.out.println("firstnum = " + num1 + " secondnum = " + num2);
        num1= num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("after swap:");
        System.out.println("firstnum = " + num1 +  " secondnum = " + num2);
        int num4 = (int)num3;
        System.out.println("Decimal number as Integer =" + num4);
        ++num1;
        System.out.println("Incremented first number = " + num1);
       --num2;
        System.out.println("Decremented second number =" + num2);
        int num5 = num1 & num2;
        System.out.println("Bitwise& of first and second number =" + num5);





    }
}
