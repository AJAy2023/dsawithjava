public class patter_IMP {

        public static void main(String args[]) {
            int i;
            System.out.println("The number pattern is:");
            for (i = 1; i < 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                // Move this outside the inner loop to print on a new line after each row
                System.out.println(); 
            }
        }
    }
    

