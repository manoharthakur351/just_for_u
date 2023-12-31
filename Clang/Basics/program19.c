#include <stdio.h>
int main()
{
    // enter 5 strings each of size 10
    char name[5][10];

    for (int i = 0; i < 5; i++)
    {
        printf("enter name. %d : ", i);
        scanf("%s", name[i]);
    }

    printf("5 names are:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%s\n", name[i]);
    }

    return 0;
}