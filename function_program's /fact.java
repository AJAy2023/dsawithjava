 class factorial {
    
        public int calculateFactorial(int number) {
            int result = 1;
            int i = number;
            while (i > 0) {
                result = result * i;
                i--;
            }
            return result;
        }
    
        public void printfactorial() {
            for (int i = 1; i <= 10; i++) {
                int factorial = calculateFactorial(i);
                System.out.println("Factorial of " + i + " is " + factorial);
            }
        }
    }
    
    public class fact {
        public static void main(String[] args) {
            factorial calculator = new factorial();
            calculator.printfactorial();
        }
    }
    

