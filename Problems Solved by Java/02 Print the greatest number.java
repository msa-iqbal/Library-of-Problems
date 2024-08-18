
package BasicCode;

import java.util.Scanner;

public class BasicCode {
    public static void main(String[] args){
        Scanner input_x = new Scanner(System.in);
        Scanner input_y = new Scanner(System.in);
        Scanner input_z = new Scanner(System.in);
        
        int x, y, z;
        System.out.print("Enter The First Number: ");
        x = input_x.nextInt();
        System.out.print("Enter The Second Number: ");
        y = input_y.nextInt();
        System.out.print("Enter The Third Number: ");
        z = input_z.nextInt();
        
        if (x>y && x>z){
              System.out.println(x+" is the greatest number");
        }
        else if(y>x && y>z){
              System.out.println(y+" is the greatest number");
        }
        else
              System.out.println(z+" is is the greatest number");
    }
}

/* ----- Output ----
Input: Enter The First Number: 15
       Enter The Second Number: 64
       Enter The Third Number: 12
Result: 64 is the greatest number
*/
