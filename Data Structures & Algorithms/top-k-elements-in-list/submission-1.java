class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        // System.out.print(mp);
        List<Integer>[] bucket = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            bucket[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }
        for(int i=0;i<n;i++){
            System.out.print(bucket[i]);
        }
        List<Integer> helper = new ArrayList<>();
        for(int i=n;i>=0;i--){
            if(k>0){
                if(bucket[i].size()!=0){
                    int size = bucket[i].size();
                    for(int j=0;j<size;j++){
                        helper.add(bucket[i].get(j));
                        k--;
                    }
                }
            }else{
                break;
            }
        }
        int[] ans = new int[helper.size()];
        for(int i=0;i<helper.size();i++){
            ans[i]=helper.get(i);
        }
        return ans;
    }
}