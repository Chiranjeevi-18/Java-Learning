public class NumberAnalyzer {
    //to count the total number of comparisons and operations performed
    static int totalOperations = 0;

    // Instance variables
    int storedInt;
    float storedFloat;

    public static void main(String[] args){
        //Declare local variables to accept three inputs from the user
        int value1=30;
        float value2=10.5f;
        int value3=15;

        // Create object and assign values to instance variables
        NumberAnalyzer a = new NumberAnalyzer();
        a.storedInt = value1;
        a.storedFloat = value2;

        //Apply pre-increment on value1 and post-decrement on value3. Print the updated values.
        ++value1;
        value3--;
        System.out.println("\nAfter pre-increment, value1: "+value1);
        System.out.println("After post-decrement, value3: " +value3);

        // Relational comparisons
        boolean isGreater = value1 > value3;
        boolean isEqual = value1 == value3;
        totalOperations += 2;  // two comparisons

        System.out.println("\nIs value1 is greater value3 " + isGreater);
        System.out.println("Is value1 is equal value3? " + isEqual);

        // Logical comparison
        boolean logicalResult = (value1 > value3) && (value1 != 0);
        totalOperations += 1;  // one logical operation

        System.out.println("\nLogical operation of (value1 > value3 && value1 != 0): " + logicalResult);

        // Typecasting float to int
        int typeCast = (int) value2;
        System.out.println("\nCasted to int: " + typeCast);

        // Bitwise XOR of value1 and value 3
        int xor = value1 ^ value3;
        totalOperations += 1;  // one bitwise operation

        System.out.println("\n Bitwise XOR of value1 and value3: " + xor);

        // Display instance variables
        System.out.println("storedInt: " + a.storedInt);
        System.out.println("storedFloat: " + a.storedFloat);

        // Display total operations/comparisons
        System.out.println("\nTotal operations/comparisons performed: " + totalOperations);

        // Final comparison message
        boolean bothGreater = (value1 > typeCast) && (value3 > typeCast);
        System.out.println("\nAre both value1 and value3 greater than the Type cast float? " + bothGreater);


    }
}
