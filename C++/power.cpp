// Program to find the power of a number without using pow function
#include<bits/stdc++.h>

using namespace std;

int main() {
    int base , exp;
    cout << "Enter base : " ; cin >> base ;
    cout << "Enter exponent: " ; cin >> exp;

    double ans=1 ;
    
    while(exp>0) {
        if(exp&1) {
            ans*=base;
        }
        base*=base;
        exp>>=1;
    }

    cout << ans << endl;
}
