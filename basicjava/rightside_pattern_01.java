public class rightside_pattern_01 {
    public static void main(String[] args) {
        int n=4;
        int nsp =n-1;
        int nst = 1;
        for(int i=1; i<=n; i++)
        {

        for(int k=1; k<=nsp; k++)
        {
            System.out.print(" ");
        }
            for(int j=1; j<=nst; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            nst++;
            nsp--;
    }
}
}
