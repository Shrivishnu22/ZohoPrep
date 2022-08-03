/*
X Pattern 

I/p : zohointerview
O/p : 
z           z
 o         o 
  h       h  
   o     o   
    i   i    
     n n     
      t      
     e e     
    r   r    
   v     v   
  i       i  
 e         e 
w           w

I/p : vishnu
O/p : 
v    v
 i  i 
  ss  
  hh  
 n  n 
u    u
*/


#include <bits/stdc++.h>

using namespace std;

int main()
{
    string s;
    cin>>s;
    int len=s.size();
    for(int i=0;i<len;i++){
        for(int j=0;j<len;j++){
            if(i==j || j==len-i-1)  cout<<s[i];
            else    cout<<" ";
        }
        cout<<"\n";
    }

    return 0;
}
