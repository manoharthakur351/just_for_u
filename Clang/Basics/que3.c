#include <stdio.h>
int main()
{
    //
    int r, c;

    printf("Enter no. of rows: ");
    scanf("%d", &r);
    printf("Enter no. of cols.: ");
    scanf("%d", &c);

    float arr1[r][c];
    float arr2[r][c];

    printf("\nFor first array:  \n");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("Enter value (%d, %d): ", i, j);
            scanf("%f", & arr1[i][j]);
        }
    }
    
    printf("\nFor second array:  \n");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("Enter value (%d, %d): ", i, j);
            scanf("%f", & arr2[i][j]);
        }
    }
    
    printf("\nSum:  \n");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            printf("%f + %f = %f\n", arr1[i][j], arr2[i][j], arr1[i][j]+arr2[i][j]);
            //scanf("%f", & arr1[i][j]);
        }
    }

    return 0;
}