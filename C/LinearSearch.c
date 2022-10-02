#include <stdio.h>

int findPosition(int arr[], int size, int key)
{
    int pos;
    for (pos = 0; pos < size; pos++)
    {
        if (arr[pos] == key)
            return pos + 1;
    }
    return -1;
}

int main()
{
    int size, found, key, index;
    int arr[100];

    printf("<------ LINEAR SEARCH PROGRAM ------> \n\n");
    printf("--> Enter size of array : ");
    scanf("%d", &size);

    for (int el = 1; el <= size; el++)
    {
        printf(" \n==> Enter element %d : ", el);
        scanf("%d", &arr[el - 1]);
    }

    printf("------------------------------------- \n");
    printf("==> ARRAY: ");

    printf("[");
    for (int i = 0; i < size - 1; i++)
    {
        printf("%d, ", arr[i]);
    }
    printf("%d]\n\n", arr[size - 1]);

    printf("--> Enter the element to search : ");
    scanf("%d", &key);

    index = findPosition(arr, size, key);

    if (index != -1)
        printf("FOUND! %d is present at %d.", key, index);
    else
        printf("OOPS! %d isn't present.", key);

    return 0;
}
