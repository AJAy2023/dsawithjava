
public class AlphabetPattern {
    public static void main(String[] args) {
        // Number of rows
        int n = 5;

        // Outer loop for the number of rows
        for (int i = 0; i < n; i++) {
            // Inner loop to print the alphabet
            for (int j = 0; j <= i; j++) {
                System.out.print((char)(65 + j) + " ");
            }
            System.out.println();
        }
    }
}