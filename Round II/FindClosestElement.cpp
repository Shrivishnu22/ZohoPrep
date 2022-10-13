/*
Find the closest element 

At first, find the average value and take it as target.
Find the closest element to the target.

I/p: arr={7,12,4,18,27,37}
O/p: 18
*/

//Using Sorting

#include <bits/stdc++.h>

using namespace std;

int main()
{
    vector<int>arr={7,12,4,18,27,37};
    int sum=0;
    for(int ele:arr)    sum+=ele;
    sort(arr.begin(),arr.end());
    int target=(sum/arr.size()),min=0,max=0;
    for(int i=0;i<arr.size();i++){
        if(arr[i]>target){
            min=arr[i-1];
            max=arr[i];
            break;
        }
    }
    int res=0;
    if((target-min)<(max-target))   res=min;
    else    res=max;
    cout<<res;
    return 0;
}

//Implemented Without Sorting

#include <bits/stdc++.h>

using namespace std;

int main()
{
    vector<int>arr={7,12,4,18,27,37};
    int sum=0;
    for(int ele:arr)    sum+=ele;
    int target=(sum/arr.size()),min=INT_MAX,res=0;
    for(int i=0;i<arr.size();i++){
        int diff = abs(target-arr[i]);
        if(diff<min){
            min=diff;
            res=arr[i];
        }
    }
    cout<<res;
    return 0;
}

