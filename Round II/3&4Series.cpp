/*
Find n’th number in a number system with only 3 and 4

3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444, …
*/

#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int arr[n+1],count=2,start=0,end=1,i;
    arr[0]=3,arr[1]=4;
    while(count<=n){
        for(i=start;i<end&&count<=n;i++){
            arr[count++]=arr[i]*10+3;
            arr[count++]=arr[i]*10+4;
        }
        start=end;
        end++;
    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}
