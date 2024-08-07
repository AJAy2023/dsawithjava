public class butterfky {
    public static void main(String[] args) {
        int n=9; 
        int nst = 1;
        int nsp = n/2;
        for(int i=1; i<=n; i++)
        {
                for(int j=1; j<=nst; j++)
                {
                    System.out.print("x");
                }
                 for(int k=1; k<=nsp; k++)
                 {
                    System.out.print("  ");
                 }
                 for(int j=1; j<=nst; j++)
                {
                    System.out.print("x");
                }
                if(i<=n/2)
                {
                     nst=nst+1;
                    nsp = nsp-1;
                }else{
                    nst=nst-1;
                    nsp++;
                }
                System.out.println();
        }
    }
}
