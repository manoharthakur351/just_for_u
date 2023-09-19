#include <stdio.h>

int main() {
    int choice, a, b;
    
    printf("SIMPLE CALCULATIONS\n");
    printf("Choose an operation:\n");
    printf("1. Addition\n");
    printf("2. Subtraction\n");
    printf("3. Multiplication\n");
    printf("4. Division\n");
    printf("5. Exponentiation\n");
    printf("Choice: ");
    scanf("%d", &choice);

    printf("Enter first number: ");
    scanf("%d", &a);
    printf("Enter second number: ");
    scanf("%d", &b);

    if (choice == 1) {
        printf("Sum of %d and %d is %d.\n", a, b, a + b);
    } else if (choice == 2) {
        printf("Difference between %d and %d is %d.\n", a, b, a - b);
    } else if (choice == 3) {
        printf("Product of %d and %d is %d.\n", a, b, a * b);
    } else if (choice == 4) {
        if (b != 0) {
            printf("Division of %d by %d is %.2f.\n", a, b, (float)a / b);
        } else {
            printf("Error: Division by zero!\n");
        }
    } else if (choice == 5) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        printf("%d raised to the power of %d is %d.\n", a, b, result);
    } else {
        printf("Invalid choice!\n");
    }
    
    return 0;
}