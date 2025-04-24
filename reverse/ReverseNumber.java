import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Read the input number

        int reversedNumber = 0;

        // Reverse the digits of the number
        while (number != 0) {
            int lastDigit = number % 10;  // Extract the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;  // Build the reversed number
            number /= 10;  // Remove the last digit
        }

        System.out.println("Reversed Number: " + reversedNumber);  // Output the result

        scanner.close();  // Close the scanner
    }
}

