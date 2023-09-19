#include <stdio.h>

int main() {
    float principal, rate, time, simpleInterest;

    // Input principal amount
    printf("Enter the principal amount: ");
    scanf("%f", &principal);

    // Input rate of interest
    printf("Enter the rate of interest (in percentage): ");
    scanf("%f", &rate);

    // Input time period in years
    printf("Enter the time period (in years): ");
    scanf("%f", &time);

    // Calculate simple interest
    simpleInterest = (principal * rate * time) / 100;

    // Display the result
    printf("Simple Interest = %.2f\n", simpleInterest);

    return 0;
}

https://pastebin.com/k4msDfDU
