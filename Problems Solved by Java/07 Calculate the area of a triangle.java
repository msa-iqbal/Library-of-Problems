
package BasicCode;

import java.util.Scanner;

public class BasicCode {
    public static void main(String args[]){   
        Scanner s= new Scanner(System.in);
        
        System.out.print("Enter the height of the Triangle: ");
        double h= s.nextDouble();
        
        System.out.print("Enter the width of the Triangle: ");
        double b= s.nextDouble();
 
        // Area = (width*height)/2
        double area=(b*h)/2;
        System.out.println("Area of Triangle is: " + area);      
    }
}

/* ----- Output ----
Input: Enter the height of the Triangle: 12
       Enter the width of the Triangle: 20

Result: Area of Triangle is: 120.0
*/
