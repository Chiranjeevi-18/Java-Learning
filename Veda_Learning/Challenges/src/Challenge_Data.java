public class Challenge_Data {
    public static void main(String[] args){
        int a=30;
        int b=15;
        double c=45.6;
        /* Swap the two integers without using a third variable */
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping:A="+a+"B="+b);

        /* find largest number*/
        int d=(a>b)?a:b;
        System.out.println("Largest Number is :"+d);

        /* Decimal number into Integer using type casting*/
        int DecimalToInt = (int) c;
        System.out.println(DecimalToInt);

        /* Increment a and decrement b by 1 each */
        ++a;
        --b;
        System.out.println(a);
        System.out.println(b);

        /* Bitwise AND operation on both integers*/
        int x=a&b;

        System.out.println("The value of a & b is: " + x);

    }
}
