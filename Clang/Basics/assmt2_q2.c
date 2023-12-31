#include <stdio.h>
#include <string.h>

struct Book
{
    char title[77];
    char authur[77];
    int year;
    long int isbn;
    int cond;
};

// function to input books
//struct Book input_books(struct Book book) {
//    }

// main
int main()
{
    int n, year;
    long int isbn;
    char auth[77], title[77];
    char search[77];
    struct Book book[50];
    printf("Enter no of books you wanna add: ");
    scanf("%d", &n);

    for (int i = 0; i < n; i++)
    {
        printf("\nEnter the title of Book: ");
        scanf("%s", &book[i].title);
        printf("Enter the title of author : ");
        scanf("%s", &book[i].authur);
        printf("Enter the year of publication: ");
        scanf("%d", &book[i].year);
        printf("Enter the isbn no.: ");
        scanf("%d", &book[i].isbn);
    }

    // display
    printf("\nALL BOOKS\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d.%s\n", i + 1, book[i].title);
        printf("\tAuthor = %s\n", book[i].authur);
        printf("\tYear = %d\n", book[i].year);
        printf("\tISBN = %ld\n", book[i].isbn);
    }

    // search for books
    printf("\nEnter name of Book you wann a search for: ");
    scanf("%s", &search);

    for (int i = 0; i < n; i++)

    {
        if (strstr(book[i].title, search))
        {
            printf("book found \n ");
            printf("%d.%s\n", i + 1, book[i].title);
            printf("\tAuthor = %s\n", book[i].authur);
            printf("\tYear = %d\n", book[i].year);
            printf("\tISBN = %ld\n", book[i].isbn);
            continue;
        }
        if (i == n)
            goto notfound;
    }

notfound:
    printf("Book not found!!\n");

    return 0;
}