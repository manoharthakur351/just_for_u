#include <stdio.h>

int main() {
    int a, b, choice, result;
    printf("SIMPLE CALCULATIONS\n");
    printf("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\nChoice: ");
    scanf("%d", &choice);

    printf("Enter two numbers: ");
    scanf("%d%d", &a, &b);

    switch (choice) {
        case 1:
            printf("Sum: %d\n", a + b);
            
        case 2:
            printf("Difference: %d\n", a - b);
            break;
        case 3:
            printf("Product: %d\n", a * b);
            break;
        case 4:
            if (b != 0) {
                printf("Division: %.2f\n", (float)a / b);
            } else {
                printf("Error: Division by zero!\n");
            }
            break;
        case 5:
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            printf("Result: %d\n", result);
            break;
        default:
            printf("Invalid choice!\n");
    }
    
    return 0;
}    case 5:
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            printf("%d raised to the power of %d is %d.\n", a, b, result);
            break;
        default:
            printf("Invalid choice!\n");
    }
    
    return 0;
}