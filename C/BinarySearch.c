#include <stdio.h>

int checkSorted(int arr[],int size){
    if(size == 1 || size == 0) return 1;
    if(arr[size-1] < arr[size-2]) return 0;
    return checkSorted(arr,size-1);
}

int findPosition(int arr[],int size,int key){
    int start = 0;
    int end = size;
    int mid;
    while (start<end)
    {
        mid = start + (end - start)/2;
        if(arr[mid] == key) return mid+1;
        else if(arr[mid] < key) start = mid + 1;
        else end = mid - 1;
    }
    
    return -1;
}

int main(){
    int size,found,key,index;
    int arr[100];

    printf("<------ BINARY SEARCH PROGRAM ------> \n\n");
    printf("--> Enter size of sorted array : ");
    scanf("%d",&size);
    
    for (int el = 1; el <= size; el++)
    {
        printf(" \n==> Enter element %d : ",el);
        scanf("%d",&arr[el-1]);
    }
    
    printf("------------------------------------- \n");
    
    printf("==> ARRAY: ");
    
    printf("[");
    for(int idx = 0; idx < size-1; idx++){
        printf("%d, ",arr[idx]);
    }
    printf("%d]\n\n",arr[size-1]);
    
    if(!checkSorted(arr,size)){
        printf("OOPS! ARRAY IS NOT SORTED.");
        return 0;
    }
    printf("--> Enter the element to search : ");
    scanf("%d",&key);

    index = findPosition(arr,size,key);
    if(index != -1) printf("FOUND! %d is present at %d.",key,index);
    else printf("OOPS! %d isn't present.",key);
    
    return 0;
}
