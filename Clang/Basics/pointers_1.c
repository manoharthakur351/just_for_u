#include <stdio.h>
int main(){
    int a =10;
    int *b;
    b = &a;
    printf ("%d\n", *b);
    printf ("%d\n", &a);
    printf ("%d\n", b);
    
    return 0;	
}