import  java.util.*;
import java.util.Scanner;
class patterntiangle
{
    void patterndisplay(int n)
     {
          int counter = 1;
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(counter + " ");
			counter++;
		}
	System.out.println();
	}
   }
}

class pattern1a
{
	public static void main(String args[])
	{
	 patterntiangle pg  = new  patterntiangle();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int rows = sc.nextInt();
	System.out.println("the pattern is....");
	pg.patterndisplay(rows);
    sc.close();
}
}