import java.util.Scanner;

public class prim_rev1 {
    public static void main(String args[])
    {
        int count  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n  = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
           if(n%i==0)
           {
            count++;
           }
        }

        if(count == 2)
        {
            System.out.println("the given number is prime");
        }else{
            System.out.println("number is not prime ");
        }
        sc.close();;
    }
}
