class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0]=nums[0];
        suffix[0]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i];
            suffix[i]= suffix[i-1]*nums[n-i-1];
        }

        int[] sol = new int[n];
        for(int i=0;i<n;i++){
            int pref=1;
            int suff=1;
            if(i>0){
                pref=prefix[i-1];
            }
            if(i<n-1){
                suff=suffix[n-1-(i+1)];
            }
            sol[i] = pref*suff;
        }
        return sol;
    }
}  
