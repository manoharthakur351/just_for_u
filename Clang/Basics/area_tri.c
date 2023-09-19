#include <stdio.h>

int main() {
    float base, height, area;

    // Input base and height from the user
    printf("Enter the base of the triangle: ");
    scanf("%f", &base);
    printf("Enter the height of the triangle: ");
    scanf("%f", &height);

    // Calculate the area of the triangle
    area = 0.5 * base * height;

    // Display the result
    printf("The area of the triangle is: %.2f square units\n", area);

    return 0;
}