import java.util.Scanner;
class funnction_01{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        
        int nFact = fact(n);            // Calculate n!
        int rFact = fact(r);            // Calculate r!
        int nMinusRFact = fact(n - r);  // Calculate (n - r)!
        
        int nPr = nFact / nMinusRFact;  // Calculate nPr
        int nCr = nPr / rFact;          // Calculate nCr
        
        System.out.println(nFact);      // Output n!
        System.out.println(nPr);        // Output nPr
        System.out.println(nCr);        // Output nCr
        
        scn.close();
    } 
    
    public static int fact(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        return ans;
    }
}