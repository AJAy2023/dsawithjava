public class exceptionhandling {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Exception caught: Cannot divide by zero");

        } finally {
            // Code that always executes
            System.out.println("Finally block: This code executes no matter what.");
        }

        System.out.println("Program continues normally after handling the exception.");
    }
}
