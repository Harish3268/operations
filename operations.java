import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Input: Array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // Calculate sum, max, and min
        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Calculate average
        double average = (double) sum / n;

        // Output: Results
        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Close scanner
        scanner.close();
    }
}
