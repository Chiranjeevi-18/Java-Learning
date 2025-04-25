package Arrays;

import java.util.Scanner;

public class arrayProgram {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int num = sc.nextInt();
        int[] array= new int[num];
        for (int i=0; i<num;i++) {
            System.out.print("Enter array elements:" );
            array[i] = sc.nextInt();
        }
        System.out.println("The elements in the array are:");
            for(int i=0; i<num; i++){
                System.out.print(array[i]  + " " );
            }
         int result= calculateSum(array);
        System.out.println("");
        System.out.println("sum of array elements:" + result);
        largestNumber(array, num);

        System.out.println("Reversed array is :");
        reverseArray(array);

        System.out.println("Enter the no.of rows (R):");
        int R= sc.nextInt();
        System.out.println("Enter the no.of columns (C):");
        int C= sc.nextInt();
        int [][] twoArray = new int [R][C];
        System.out.println("Elements of 2D array:");
        for(int i=0; i< R; i++){
            for(int j=0; j<C ; j++){

                System.out.print("Enter element [" + i + "][" + j + "]: ");
                twoArray[i][j] = sc.nextInt();
            }
        }
        int[] rowSum = rowSums(twoArray);
        System.out.println("Row-wise sums:");
        for (int i = 0; i < rowSum.length; i++)
            System.out.println("Row " + (i + 1) + ": " + rowSum[i]);

    }
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void largestNumber(int[] arr, int size){
        int max= arr[0];
        for (int i=1; i<size; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest element in the array:" + max);
    }
    public static void reverseArray(int[] arr){
        for (int i= arr.length-1; i>=0; i--){
            System.out.print( arr[i] + " ");
        }
        System.out.println();




    }
    public static int[] rowSums(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                sums[i] += matrix[i][j];
        return sums;
    }
}




