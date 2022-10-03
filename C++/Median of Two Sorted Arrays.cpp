#include<bits/stdc++.h>
using namespace std;

//function for finding median of sorted arrays
double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        vector<int> nums3(nums1.size()+nums2.size());
        double ua = 0;      
        merge(nums1.begin(),nums1.end(),nums2.begin(),nums2.end(),nums3.begin());
        
        int t = nums3.size();
        if(t%2==0){
          ua = nums3[(t/2)-1]+nums3[(t/2)];
            ua = ua/2; }
        else
            ua = nums3[(t-1)/2];
        
  return ua;
    }

//Main function
int main(){
  vector<int> v1;
  vector<int> v2;
    int n1,n2,i;
    cin>>n1>>n2;
    for (i = 0; i < n1; ++i){
        int r;
        cin>>r;
        v1.push_back(r);
    }
  for (i = 0; i < n2; ++i){
        int r;
        cin>>r;
        v2.push_back(r);
    }
  cout<<findMedianSortedArrays(v1,v2)<<endl;
  return 0;
}
