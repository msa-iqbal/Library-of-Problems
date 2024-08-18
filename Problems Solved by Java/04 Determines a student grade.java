
package BasicCode;

import java.util.Scanner;

public class BasicCode {
    public static void main(String[] args){
        Scanner input_var = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the number: ");
        num = input_var.nextInt();
        
        if (num >= 80){
            System.out.println("The student\'s grade is A+");
        }
        else if(num<80 && num>=70 ){
            System.out.println("The student\'s grade is A");
        }
        else if(num<70 && num>=60 ){
            System.out.println("The student\'s grade is A-");
        }
        else if(num<60 && num>=50 ){
            System.out.println("The student\'s grade is B");
        }
        else if(num<50 && num>=40 ){
            System.out.println("The student\'s grade is C");
        }
        else if(num<40 && num>=33 ){
            System.out.println("The student\'s grade is D");
        }
        else
            System.out.println("The student\'s grade is F");
        
    }
}

/* ----- Output ----
Input: Enter the number: 64
Result: The student's grade is A-
*/
