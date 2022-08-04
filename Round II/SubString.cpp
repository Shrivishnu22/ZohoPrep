/*
Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
        
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
        
*/


#include <bits/stdc++.h>

using namespace std;

int main()
{
    string str1,str2;
    cin>>str1>>str2;
    bool flag=true;
    int len=str1.size(),idx=0,slen=str2.size();
    while(idx<len){
        if(str1[idx]==str2[0]){
            string sub = str1.substr(idx,slen);     
            if(sub==str2){
                cout<<idx<<endl;
                flag=false;
                break;
            }
        }
        idx++;
    }
    if(flag)   cout<<-1<<endl;
    return 0;
}
