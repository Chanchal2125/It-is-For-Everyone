#include<iostream>
#include<stdlib.h>
#define SIZE 25
using namespace std;
int main()
{
    int a[SIZE],n,position,ch,ele;
    cout<<"Enter the array size:\t";
    cin>>n;
    cout<<"Enter the array elements:\n";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"\nArray elements are:\n";
    for(int i=0;i<n;i++)
    {
        cout<<a[i]<<"\t";
    }
    while(1)
    {
        cout<<"\n\n1:Insertion\n2:Deletion\n3:Display\n4:Exit\nEnter your choice:\t";
        cin>>ch;
        /*if(ch>SIZE)
        {
            cout<<"Invalid choice";
            break;
        }*/
        switch(ch)
        {
            case 1: cout<<"\nEnter the position of element to insert:\t";
                    cin>>position;
                    cout<<"Enter the  element to insert:\t";
                    cin>>ele;
                    if(n<20)
                    {
                        for(int i=n-1;i>=position;i--)
                        {
                           a[i+1]=a[i];
                        }
                        a[position]=ele;
                        n++;
                    }
                    else
                    {
                        cout<<"Array is full";
                    }
                    break;
            case 2: cout<<"\nEnter the position of element to delete:\t";
                    cin>>position;
                    if(position>=n)
                    {
                        cout<<"Invalid choice";
                    }
                    else
                    {
                        for(int i=position;i<n-1;i++)
                        {
                           a[i]=a[i+1];
                        }
                        n--;
                    }
                    break;
            case 3: cout<<"\n";
                    for(int i=0;i<n;i++)
                    {
                        cout<<a[i]<<"\t";
                    }
                    break;
            case 4: exit(0);
        }
    }
    return 0;
}