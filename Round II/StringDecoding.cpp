/*
Eg 1: Input: a1b10
       Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
          Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
*/

#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s,out;
    cin>>s;
    char ch;
    int num=0;
    for(int i=0;i<=s.size();i++){
        if(s[i]>='0'&&s[i]<='9'){
            num=num*10+(s[i]-'0');
        }
        else if(num>0){
            while(num>0){
                out+=ch;
                num--;
            }
            ch=s[i];
        }else{
            ch=s[i];
        }
       
    }
    cout<<out<<endl;
    return 0;
}
