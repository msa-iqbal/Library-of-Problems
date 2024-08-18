
package BasicCode;

import java.util.Scanner;

public class BasicCode {
    public static void main(String args[]){
        Scanner input_var = new Scanner(System.in);
        
        int num;
        System.out.print("Enter The Number: ");
        num = input_var.nextInt();

        if(num>0){
                System.out.println(num+" is Positive Number");
        }else if(num<0){
                      System.out.println(num+" is Negative Number");
        }else{
            System.out.println(num+" is neither positive nor negative number");
        }    
    }
}


/* ---- Output ----
Input: Enter The Number: -6
Result: -6 is Negative Number
---------------------------------
Input: Enter The Number: 0
Result: 0 is neither positive nor negative number
*/