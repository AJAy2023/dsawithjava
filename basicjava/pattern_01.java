import java.util.Scanner;


public class pattern_01{
    public static void main(String args[])
    {
        int nst = 1;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=nst; j++)
            {
                System.out.print("*");
            }
            nst++;
            System.out.println();
        }
        scn.close();
    }
}