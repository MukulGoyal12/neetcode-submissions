class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            int s=i+1;
            int e=n-1;
            while(s<e){
                int sum=nums[s]+nums[e]+nums[i];
                if(sum>0){
                    e--;
                }else if(sum<0){
                    s++;
                }else{
                    st.add(Arrays.asList(nums[i],nums[s],nums[e]));
                    s++;
                    e--;
                }
            }
        }
        for(List<Integer> lists : st){
            ans.add(lists);
        }
        return ans; 
    }
}
