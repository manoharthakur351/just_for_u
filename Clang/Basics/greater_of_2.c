#include <stdio.h>

int main() {
    int num1, num2;

    // Input the first number
    printf("Enter the first number: ");
    scanf("%d", &num1);

    // Input the second number
    printf("Enter the second number: ");
    scanf("%d", &num2);

    // Compare the two numbers
    if (num1 > num2) {
        printf("%d is greater than %d\n", num1, num2);
    } else if (num2 > num1) {
        printf("%d is greater than %d\n", num2, num1);
    } else {
        printf("Both numbers are equal\n");
    }

    return 0;
}