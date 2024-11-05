
    public class StaticExample {
        // Static variable
        static int count = 0;
    
        // Static method
        static void displayCount() {
            System.out.println("Count is: " + count);
        }
    
        // Static block
        static {
            System.out.println("Static block executed.");
            count = 10;  // Initializing static variable
        }
    
        // Instance method to increment count
        void incrementCount() {
            count++;
        }
    
        public static void main(String[] args) {
            // Accessing static method without creating an object
            StaticExample.displayCount();
    
            // Creating objects
            StaticExample obj1 = new StaticExample();
            StaticExample obj2 = new StaticExample();
    
            // Modifying static variable through instance method
            obj1.incrementCount();
            obj2.incrementCount();
    
            // Displaying count after modifications
            StaticExample.displayCount();
        }
    }
    

