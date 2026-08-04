class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        while(s!=e){
            if(nums[s]>nums[e]){
                s++;
            }else{
                e--;
            }
        }
        return nums[s];
    }
}
