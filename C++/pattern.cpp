#include<iostream>
using namespace std;
int main()
{
    cout<<"\n\t\t\t\t\t*******************PATTERN'S*******************\n";
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            cout<<"$";
        }
        cout<<endl;
    }
    cout<<"\a";
    for(int i=0;i<4;i++)
    {
        cout<<"\t\t";
        for(int j=0;j<4;j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    for(int i=0;i<4;i++)
    {
        cout<<"\t\t\t\t";
        for(int j=0;j<4;j++)
        {
            cout<<"#";
        }
        cout<<endl;
    }
    for(int i=0;i<4;i++)
    {
        cout<<"\t\t\t\t\t\t";
        for(int j=0;j<4;j++)
        {
            cout<<"@";
        }
        cout<<endl;
    }
    for(int i=0;i<4;i++)
    {
        cout<<"\t\t\t\t\t\t\t\t";
        for(int j=0;j<4;j++)
        {
            cout<<"|_|";
        }
        cout<<endl;
    }
    for(int i=0;i<4;i++)
    {
        cout<<"\t\t\t\t\t\t\t\t\t\t";
        for(int j=i;j<4;j++)
        {
            cout<<"*";
        }
        cout<<endl;
    }
    cout<<endl;
    for(int i=0;i<=4;i++)
    {
        cout<<"\t\t\t\t\t\t\t\t\t\t\t\t";
        for(int j=0;j<i;j++)
        {
            cout<<"@";
        }
        cout<<endl;
    }
    return 0;
}
