
package BasicCode;

import java.util.Scanner;

public class BasicCode {
    public static void main(String[] args){
        Scanner input_var = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the number: ");
        num = input_var.nextInt();
        
        if (num%2==0){
        System.out.println("The number is even");
        }
        else
        System.out.println("The number is odd");
    }
}

/* ----- Output ----
Input: Enter the number: 15
Result: The number is odd
---------------------------
Input: Enter the number: 20
Result: The number is even
*/
