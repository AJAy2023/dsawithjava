import java.util.Scanner;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt(); // User input for the number
        int reverse = 0; // Variable to store the reversed number

        while (n > 0) {
            int lastDigit = n % 10; // Get the last digit
            reverse = reverse * 10 + lastDigit; // Append last digit to the reversed number
            n = n / 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reverse); // Print the reversed number
    }
}

