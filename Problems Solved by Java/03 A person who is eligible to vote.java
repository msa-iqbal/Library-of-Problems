
package BasicCode;

import java.util.Scanner;

public class BasicCode {
    public static void main(String[] args){
        Scanner input_var = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the age of person: ");
        num = input_var.nextInt();
        
        if (num >= 18){
        System.out.println("This person is eligible to vote");
        }
        else
        System.out.println("This person isn\'t eligible to vote");
    }
}

/* ----- Output ----
Input: Enter the age of person: 15
Result: This person isn't eligible to vote
----------------------
Input: Enter the age of person: 20
Input: This person is eligible to vote

*/
