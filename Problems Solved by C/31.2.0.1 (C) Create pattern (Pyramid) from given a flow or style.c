/// Create a pattern from given a flow/syntax/style (Pyramid)
/*
                 1
                1 2
               1 2 3
              1 2 3 4
             1 2 3 4 5
*/
/*
            col1 col2 col3 col4 col5 col6 col7 col8 col9
row1                                  1
row2                           1            2
row3                    1            2            3
row4             1             2            3            4
row5     1             2             3           4              5
*/

#include <stdio.h>

int main()
{
    int n, row, col;

    printf(" Enter the value of n: ");
    scanf("%d", &n);
    printf("\n");

    for(row=1; row<=n; row++){
            // for space print
            for(col=1; col<=n-row; col++){
                    printf(" ");
            }
           // for number print
            for(col=1; col<=row; col++){
                    printf(" %d", col);
            }
            printf("\n");
    }

    return 0;
}

/* ===== Output / Result:
Input:
Enter the value of n: 5

Output:
     1
    1 2
   1 2 3
  1 2 3 4
 1 2 3 4 5
*/








