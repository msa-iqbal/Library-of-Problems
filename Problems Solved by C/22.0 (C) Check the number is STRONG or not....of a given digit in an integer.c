/// Check the number is STRONG or not....of a given digit in an integer
/*
Calculation Steps:
        - Calculate total digits from given integer number
        - Calculate factorial for each digit
        - Sum of factorial
        - Check, if (GivenNumber == SumOfFactorial)
                                  then, STRONG Number
                     else
                                          not STRONG Number
     Example:
                  145 = 1 + 4   + 5      (Calculate Total digit)
                        = 1 + 24 + 120   (Calculate Factorial for each digit)
                        = 145                 (Summation of factorial)
                  now, (145==145) then STRONG number
*/

#include <stdio.h>

int main()
{
    int num, temp, sum=0, rem, fact;

    printf(" Enter an integer number: ");
    scanf("%d", &num);

    temp=num;

    while(temp != 0)
    {
        rem=temp%10;        // Calculate digit

        /* ------- Calculate factorial --------- */
        fact=1;
        for(int i=1; i<=rem; i++)
        {
            fact =fact*i;
        }

        sum=sum+fact;
        temp=temp/10;
    }

    if(num==sum)
        printf(" %d is a STRONG number", num);
    else
        printf(" %d isn't a STRONG number", num);

    return 0;
}

/* ===== Output / Result:
Input:
Enter an integer number: 145

Output:
145 is a STRONG number
*/

