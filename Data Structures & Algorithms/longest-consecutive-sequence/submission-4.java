class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        } 
        int maxCnt=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            if(!st.contains(nums[i]-1)){
                cnt++;
                int currNum=nums[i];
                
                while(st.contains(currNum+1)){
                    cnt++;
                    currNum+=1;
                }
                maxCnt=Math.max(cnt,maxCnt);
            }
        }
        return maxCnt;
    }
}
