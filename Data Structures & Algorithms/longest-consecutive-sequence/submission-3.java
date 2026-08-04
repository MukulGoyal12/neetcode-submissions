class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Map<Integer,Boolean> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],false);
        } 
        int maxCnt=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            int num=nums[i];
            if(mp.get(num) == false && !mp.containsKey(num - 1)){
                cnt++;
                mp.put(nums[i],true);
            
                while(mp.containsKey(num+1) && mp.get(num+1)==false ){
                    cnt++;
                    mp.put(num+1,true);
                    num=num+1;
                }
                maxCnt=Math.max(cnt,maxCnt);
            }
        }
        return maxCnt;
    }
}
