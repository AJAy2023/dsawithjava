
    import java.io.*;
import java.util.Scanner;

class numbertriangle
{
   void numberdisplay(int n)
   {
	for(int i=1; i<=n; i++)
	{
	  for(int j=1; j<=i; j++)
	  {
		System.out.print(j+" ");
	  }
	System.out.println();
     }
  }
}
 
class pattern1
{
  public static void main(String args[])
  {
     numbertriangle pg  = new numbertriangle();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows");
     int rows = sc.nextInt();
     System.out.println("the number pattern is.....");
     pg.numberdisplay(rows);
     sc.close();
  }
}
  
 
   


 

