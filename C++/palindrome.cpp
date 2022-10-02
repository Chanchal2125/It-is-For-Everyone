#include<bits/stdc++.h>
using namespace std;
int check(string s,int n)
{

    for(int i=0;i<n/2;i++)
    {
        if(s[i]!=s[n-1-i])
        {
            return 0;
        }
        else
        {
            continue;
        }

    }
    return 1; 
}
int main()
{
    string s;
    cout<<"Enter the string=> "<<endl;
    cin>>s;
    int n=s.length();
    int c=check(s,n);
    if(c==0)
    cout<<"\nNot Palindrome";
    else
    cout<<"\nPalindrome";
    return 0;
}
