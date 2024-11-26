


//  Q.1 Given n length Array, You have to return sum of all the elements.


package arrays_all;

import java.util.Scanner;

public class sumarr {

    public static void main(String[] args) {
        
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter an  number element of an array");
        int n  = scn.nextInt();

        int [] array  = new int[n];

        System.out.println("enter the  element of an array");
        for(int i=0; i<n; i++)
        {
            array[i] = scn.nextInt();
        }

        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum  = sum + array[i];
        }
        System.out.println("sum of all array  element " + sum);
        scn.close();
    }
    
}