#include<iostream>
#include<map>
using namespace std;
int main(){
    string s;
    cout<<"Enter word"<<endl;
    cin>>s;
    map<char,int> charmap;
    
    for(int i=0;s[i]!='\0';i++){
        charmap[s[i]]++;
    }
    cout<<"The Frequency of each character in word is as follows: "<<endl;
    for(auto it: charmap){
       cout<< it.first << " " << it.second << endl;
    }
    return 0;
}