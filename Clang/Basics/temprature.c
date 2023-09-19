#include <stdio.h>
int main(int argc, char *argv[])
{
    float f, c;
    printf("Enter temperature value in degree Celsius: ");
    scanf("%f", &c);
    float rf;
    rf = (c * 9 / 5) + 32; // Fahrenheit mein convert karne ke liye +32 karna chahiye.
    printf("Temperature in Fahrenheit: %.3f\n", rf);
    
    printf("enter temperature value in degree Fahrenheit ");
    scanf ("%f", &f);
    float rc;
    rc = (f - 32) * 5 / 9;
    printf("Temperature in Fahrenheit: %.3f", rc);
    
    
}