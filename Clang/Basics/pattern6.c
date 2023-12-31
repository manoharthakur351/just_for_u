#include <stdio.h>
int main()
{
    int num, itr = 1;
    printf("Enter number of columns: ");
    scanf("%d", &num);
    for (int i = 1; i <= num; i++)
    {
        for (int j = 0; j < num - i; j++)
        {
            printf("  ");
        }
        for (int k = 1; k <= i; k++)
        {
            printf("%d ", itr);
            itr++;
        }
        printf("\n");
    }
    return 0;
}