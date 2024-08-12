public class alphabet_pattern_01 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;            
        // int nsp = n-1;        
        char count = 'a';        
        
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= nst; j++)
            {
                System.out.print(count +" ");
            }
            count++;
            nst = nst+1;
            System.out.println();
        }
    }
}
