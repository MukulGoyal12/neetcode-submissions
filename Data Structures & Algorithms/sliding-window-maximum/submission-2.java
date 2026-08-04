class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1)return nums;
        int n= nums.length;
        int[] res= new int[n-k+1];
        int i=0;
        int max=nums[i];
        for(int j=1;j<k;j++){
            max=Math.max(max,nums[j]);
        }
        res[0]=max;
        int j=k;
        while(j<n){
            if(nums[j]<=nums[i]){
                if(nums[i]==max){
                    max=nums[i+1];
                    for(int m=i+1;m<=j;m++){
                        max=Math.max(max,nums[m]);
                    }
                }
            }else{
                if(nums[i]==max){
                    max=nums[j];
                }else{
                    max=Math.max(nums[j],max);
                }
            }
            i++;
            res[i]=max;
            j++;
        }
        return res;
    }
}
