
package BasicCode;

import java.util.Scanner;

public class BasicCode {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in); 
      
      int n,i,j,k = 1;
      System.out.print("Enter the total number of lines (for FloyidsTriangle): ");
      n = sc.nextInt();

      for(i = 1; i<= n; i++) {
         for(j=1; j <= i; j++){
                 System.out.print(" "+k);
                   k++;
         }
         System.out.println();
      }
   }
}

/* ----- Output ----
Input: Enter the total number of lines (for FloyidsTriangle): 10
Result:  
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        16 17 18 19 20 21
        22 23 24 25 26 27 28
        29 30 31 32 33 34 35 36
        37 38 39 40 41 42 43 44 45
        46 47 48 49 50 51 52 53 54 55
*/
