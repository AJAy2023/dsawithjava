public class HoloNumber {
    public static void main(String[] args) {
        int n = 7; // The number of rows in the pattern
        int nst = 1; // Number of stars to print
        int nsp = n / 2; // Number of spaces to print

        // Loop for each row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int k = 1; k <= nst; k++) {
                if (k == 1 || k == nst) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();

            // Adjust the number of spaces and stars for the next row
            if (i <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
        }
    }
}

