/**
 *  if_else
 */
import java.util.Scanner;
 class  iff
 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner lc = new Scanner(System.in);
        int n = lc.nextInt();
        if(n>=18)
        {
            System.out.println("eligible");
        }
        else
        {
            System.out.println("not eligible");
        }
    }
}