#include <iostream>
using namespace std;

#define size 10 //change accordingly
int stack[size],top=-1;

//Push function
void push(int val)
{
    if(top==size-1)
    {
        cout<<"Overflow, can't perform push operation\n";
    }
    else{
        top++;
        stack[top]=val;
    }
}

//Pop function
void pop()
{
    if(top==-1)
    {
        cout<<"Underflow, can't perform pop operation\n";
    }
    else
    {
        cout<<"Popped element is "<<stack[top]<<'\n';
        top--;
    }
}

//Traverse Function
void traverse()
{
    int i;
    if(top==-1) cout<<"Nothing to display"<<'\n';
    else{
        cout<<"Displaying elements of stack"<<'\n';
        for(i=top;i>=0;i--)
        {
            cout<<stack[i]<<'\n';
        }
    }
}

//Main function
int main()
{
    int val,ch;
    cout<<"To create a stack enter the first data to be inserted in stack"<<'\n';
    cin>>val;
    push(val);
    traverse();
    do{
        cout<<"Enter your choice"<<'\n';
        cout<<"0.exit\n1.Push element\n2.Pop element\n";
        cin>>ch;
        switch(ch)
        {
            case 1:
            {
                cout<<"Enter the value to be pushed \n";
                cin>>val;
                push(val);
                traverse();
                break;
            }
            case 2:
            {
                pop();
                traverse();
                break;
            }
            case 3:
            {
                cout<<"Invalid choice";
            }
        }
    }
    while(ch!=0);
    {
        return 0;
    }
}