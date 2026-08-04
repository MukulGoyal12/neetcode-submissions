class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,List<Integer>> mp = new HashMap<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){

            if(mp.containsKey(nums[i]-1)){
                mp.get(nums[i]-1).add(nums[i]);
                List<Integer> seq = mp.get(nums[i]-1);
                mp.remove(nums[i-1]);
                mp.put(nums[i],seq);
            }

            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],new ArrayList<>());
                mp.get(nums[i]).add(nums[i]);
            }
        }
        
        int max=0;
        for(List<Integer> seq:mp.values()){
            max=Math.max(max,seq.size());
        }
        return max;
    }
}
