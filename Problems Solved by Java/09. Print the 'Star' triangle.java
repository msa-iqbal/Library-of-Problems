/* 
Program: Write a Java Program to generate a following *'s triangle
				 ******
				  *****
				   ****
				    ***
				     **
					  *
*/

package BasicCode;
import java.util.Scanner;
public class BasicCode {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of lines (for Triangle): ");
        int n = in.nextInt();
        
        for (int i=n; i>0; i--){
            
            for (int spc=n-i; spc>0; spc--){
                System.out.print(" ");
            }
            
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* ----- Output ----
Input: Enter the number of lines (for Triangle): 6
Result: 
        ******
         *****
          ****
           ***
            **
             *
*/
