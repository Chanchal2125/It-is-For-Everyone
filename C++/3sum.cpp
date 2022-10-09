#include <vector>
#include<stdlib.h>
using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        unordered_map<int, int> hist;
        for(const int &n : nums) {
            hist[n]++;
        }
        sort(nums.begin(), nums.end());
        
        const int n = nums.size();
        vector<vector<int>> res;
        for(int i = 0; i < n; i++) {
            const int a = nums[i];
            if(i > 0 and a == nums[i - 1]) {
                continue;
            }
            
            hist[a]--;
            
            
            for(int j = i + 1; j < n; j++) {
                const int b = nums[j];
                if(j > (i + 1) and b == nums[j - 1]) {
                    continue;
                }
                const int c = -(a + b);
                if(c < b) {
                    continue;
                }
        
                hist[b]--;
                if(hist[c] > 0) {
                    res.push_back({a, b, c});
                }    
                hist[b]++;
            }
            hist[a]++;
        }
        return res;
    }
};