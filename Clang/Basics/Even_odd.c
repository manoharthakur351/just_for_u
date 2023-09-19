#include <stdio.h>
int main(int argc, char *argv[])
{
    int num;
    printf("welcome to program\n");
    printf ("Enter a number: ");
    scanf ("%d", & num);
    
    if (num % 2 == 0) printf("number is even!");
    else printf("number is odd");
}
