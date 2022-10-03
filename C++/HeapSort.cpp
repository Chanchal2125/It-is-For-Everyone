#include<iostream>
using namespace std;
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
void Max_Heapify(int arr[],int n,int i)
{
    int largest=i;
    //Left Child is largest
    if((2*i+1)<n && arr[2*i+1]>arr[largest])
        largest=2*i+1;
    //Right Child is Largest
    if((2*i+2)<n && arr[2*i+2]>arr[largest])
        largest=2*i+2;

    if(largest!=i)
    {
        swap(&arr[i],&arr[largest]);
        Max_Heapify(arr,n,largest);
    }    
}
void Build_MaxHeap(int arr[], int n)
{
    for (int i = n/2-1; i >=0; i--)
    {
        Max_Heapify(arr,n,i);
    }
}
void HeapSort(int arr[],int n)
{
    Build_MaxHeap(arr,n);
    for (int i = n-1; i >=0; i--)
    {
        swap(&arr[i],&arr[0]);
        Max_Heapify(arr,i,0);
    }
    
}
int main()
{
    int n;
    cout<<"Enter the size of array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter the array elements:"<<endl;
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }
    cout<<"Array before heapsort is:"<<endl;
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    HeapSort(arr,n);
    cout<<endl<<"Array after heapsort is:"<<endl;
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
    return 0;
}