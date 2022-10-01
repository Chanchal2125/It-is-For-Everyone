#include<iostream>
using namespace std;
class measure
{
    int add1,add2,add3;
public:
    measure()
    {
        add1=45;
        add2=32;
    }
    int process()
    {
        add3=add1+add2;
        return add3;
    }
    void display(int add3)
    {
        //process();
        cout<<"Addition of two numbers: "<<add3;
    }
};
int main()
{
    measure m;
    int x=m.process();
    m.display(x);
    return 0;
}
