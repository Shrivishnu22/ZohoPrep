/*
Write a program to print the following output for the given input. You can assume the string is of odd length

Eg 1: Input: 12345
       Output:
1       5
  2   4
    3
  2  4
1      5
Eg 2: Input: geeksforgeeks
         Output:
g                         s
  e                     k
    e                 e
      k             e
        s         g
          f      r
             o
          f     r
        s         g
      k             e
    e                 e
  e                      k
g                          s 
*/

/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <bits/stdc++.h>

using namespace std;

int main()
{
    string s="geeksforgeeks";
		bool flag=true;
		int idx=s.size()-1;
		for(int i=0;i<s.size();i++){
		    for(int j=0;j<s.size();j++){
		        flag=true;
		        if(i==j){
		            cout<<s[i];
		            flag=false;
		        }    
		        if(j==s.size()-i-1){
		            if(!flag){
		                idx--;
		                continue;
		            }
		            cout<<s[idx--];
		        } 
		        else cout<<" ";
		    }
		    cout<<"\n";
		  }

    return 0;
}

