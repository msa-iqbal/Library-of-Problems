
package BasicCode;

import java.util.Scanner;

public class BasicCode {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int i,j,n,p,q;
        System.out.print("Enter the total number of lines (for FloyidsTriangle): ");
        n = in.nextInt();
                         
        for(i=1;i<=n;i++)
        {
            if(i%2==0){
              p=1;q=0;
            }
            else{ 
              p=0;q=1;
            }
          
            for(j=1;j<=i;j++){
                if(j%2==0)
                     System.out.print(p);
                else
                     System.out.print(q);   
            }
            System.out.println("");
        }
    }
}

/* ----- Output ----
Input: Enter the total number of lines (for FloyidsTriangle): 10
Result:     
        1
        01
        101
        0101
        10101
*/
