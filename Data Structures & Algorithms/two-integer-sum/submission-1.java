class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> mp = new HashMap<>();
        int n=nums.length;
        int[] ans= new int[2];
        mp.put(nums[0],0);
        for(int i=1;i<n;i++){
            if(mp.containsKey(target-nums[i])){
                ans[0] = mp.get(target-nums[i]);
                ans[1] = i;
            }
            mp.put(nums[i],i);
        }
        Arrays.sort(ans);
        return ans;
    }
}
