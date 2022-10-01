#include<iostream>
using namespace std;
class prime
{
    int n,i;
public:
    prime()
    {
        n=86;
    }
    void process()
    {
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                cout<<n<<" is not prime number";
                break;
            }
        }
        if(i>n/2)
        {
            cout<<n<<" is prime number";
        }
    }
};
int main()
{
    prime p;
    p.process();
    return 0;
}
