/// Pass by value to a function

#include <iostream>
using namespace std;

void display (int num) //here, 'num' is Formal parameter
{
    num = 20;
}

int main()
{
    int x=10;
    cout<<"Before calling the function and x = "<<x<<endl;

    display(x); /* here, 'x' is Actual parameter and
                       in case of pass by value, a copy of the argument is passed to the function. */
    cout<<"After calling the function and x = "<<x<<endl;

    return 0;
}

/* ===== Output/Result:

 Input:___________________
 (Initialization values within a program code)

 Output:_________________
 Before calling the function and x = 10
 After calling the function and x = 10

*/