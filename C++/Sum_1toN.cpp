#include<iostream>
using namespace std;
class sum
{
    int n,s;
public:
    sum(int n1)
    {
        n=n1;
        s=0;
    }
    void  calculate()
    {
        for(int i=1;i<=n;i++)
        {
            s=s+i;
        }
        cout<<"Sum of 1 to n numbers="<<s;
    }
};
int main()
{
    sum s1(19);//implicit calling
    //sum s1=sum(19);//Explicit calling
    s1.calculate();
    return 0;
}
