package Challenges.src;
import java.util.Scanner;
public class Array_Operation {


        // Method to calculate sum of array elements
        public static int calculateSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        }

        // Void method to find and print the largest element
        public static void findLargest(int[] arr) {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Largest Element = " + max);
        }

        // Void method to reverse and print array
        public static void reverseArray(int[] arr) {
            System.out.print("Reversed Array: ");
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // Method to calculate row-wise sum of 2D array
        public static int[] rowWiseSum(int[][] matrix) {
            int[] rowSums = new int[matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                int sum = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                }
                rowSums[i] = sum;
            }
            return rowSums;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1D Array
            System.out.print("Enter the size of the array: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = calculateSum(arr);
            System.out.println("Sum of Array Elements = " + sum);

            findLargest(arr);
            reverseArray(arr);

            // 2D Array
            System.out.print("\nEnter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows][cols];
            System.out.println("Enter 2D array elements: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int[] rowSums = rowWiseSum(matrix);
            System.out.print("Row-wise Sum: ");
            for (int sumVal : rowSums) {
                System.out.print(sumVal + " ");
            }

            scanner.close();
        }





}
