package Testing;

import java.util.Scanner;

public class NumberAnalyzer {
 static   int a =0;
    int storedInt;
    float storedFloat;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value");
        int value1= sc.nextInt();
        System.out.println("Enter a float value");
        float value2= sc.nextFloat();
        System.out.println("Enter one more integer value");
        int value3= sc.nextInt();
        NumberAnalyzer NA = new NumberAnalyzer();
        NA.storedInt= value1;
        NA.storedFloat= value2;
        NA.storedInt= value3;
        ++value1;
        System.out.println("Updated value1:" + value1);
        value3--;
        System.out.println("Updated value3:" + value3);
       boolean rc1= value1>value3;
        a++;
        System.out.println("relational operator:" + rc1);
      boolean rc2 = value1==value3;
        a++;
        boolean lc= (value1>value3)&&(value1>0);
        a++;
        int value4 = (int)value2;
        System.out.println("original float value: " + value2);
        System.out.println("Updated float value after casting: " + value4);

        int value5= value1^value3;
        a++;
        System.out.println("Bitwise XOR of value1 and value3:" + value5);
        System.out.println("The final output is:");
        System.out.println("stored integer:" + NA.storedInt);
        System.out.println("stored float:" + NA.storedFloat);
        System.out.println("The total no of comparisons made:" + a);


    }
}
