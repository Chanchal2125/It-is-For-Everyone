#include<iostream>
using namespace std;
int main()
{
    int a[5],b[5],c[10],i;
    for(i=0;i<5;i++)
    {
        cout<<"Enter 1st array element a["<<i<<"]=";
        cin>>a[i];
    }
    cout<<"\n";
    for(i=0;i<5;i++)
    {
        cout<<"Enter 2nd array elements b["<<i<<"]=";
        cin>>b[i];
    }
    cout<<"\nAddition of Array elements are:\n";
    for(i=0;i<5;i++)
    {
        c[i]=a[i]+b[i];
        cout<<"a["<<i<<"]+b["<<i<<"]=c["<<i<<"]=";
        cout<<c[i];
        cout<<endl;
    }
  return 0;
}