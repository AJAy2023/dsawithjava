 /**
  * if_cond
  */



  /* given :-
   *    Take three numbers a,b and c as input. Print the max out of 3 Integers.
   *     The first line contains integer a.
        The second line contains integer b.
          The third line contains integer c.
   */
  import java.util.Scanner;
 public class if_cond {
 
    public static void main(String[] args) {
        Scanner os = new Scanner(System.in);
        int a = os.nextInt();
        int b = os.nextInt();
        int c = os.nextInt();
        
        int max = a;
        if(b>max)
        {
            max =b;
        }
        
        if(c>max)
        {
            max =c;
        }
         System.out.println("the max value is :" + max);
      
    }
    }
 