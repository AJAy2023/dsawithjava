import java.util.Scanner;

public class number_02 {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        
          int nst = 1;
        int nsp = n / 2;
        

        
        int val = 1;
        for(int i=1;i<=n;i++){
            for (int j = 0; j < nsp; j++) {
                System.out.print("  ");
            }
            if (i <= n / 2) {
                val = i;
            } else {
                val = n + 1 - i;
            }
            for (int j = 0; j < nst; j++) {
                System.out.print(val + " ");

                if (j < nst / 2) {
                    val++;
                } else {
                    val--;
                    
                }
            }

            if (i <= n / 2) {
                nsp--;
                nst = nst + 2;
            } else {
                nsp++;
                nst = nst - 2;
            }
            System.out.println();
    }
    }
}
