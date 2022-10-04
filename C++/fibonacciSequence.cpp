#include <iostream>
using namespace std;

int main() {
    int seqIter;
    int num1 = 0;
    int num2 = 1;
    int nextNum = 0;

    cout << "Number of Fibonacci terms to output: ";
    cin >> seqIter;

    cout << "Fibonacci sequence output: ";

    for (int i = 1; i <= seqIter; ++i) {

        if(i == 1) {
            cout << num1 << ", ";
            continue;
        }
        if(i == 2) {
            cout << num2 << ", ";
            continue;
        }
        nextNum = num1 + num2;
        num1 = num2;
        num2 = nextNum;
        
        cout << nextNum << ", ";
    }
    return 0;
}
