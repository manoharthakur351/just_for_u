#include <stdio.h>
int main()
{
    int num, itr = 1;
    printf("Enter number of columns: ");
    scanf("%d", &num);
    for (int i = 1; i <= num; i++)
    {
        for (int j = num - i; j > 0; j--)
            printf("  ");
        for (int k = 1; k <= i; k++)
        {
            printf("%d ", itr);
            itr++;
        }
        for (int j = 2; j <= i; j++)
        {
            printf("%d ", itr);
            itr++;
        }

        printf("\n");
    }

    return 0;
}  }

    return 0;
}