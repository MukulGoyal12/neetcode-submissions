class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles); 
        int n=piles.length;
        int s=1;
        int e=piles[n-1]; 
        int ans=0;
        while(s<=e){
            int mid= (s+e)/2;
            int time= findHours(mid,piles);
            if(time<=h){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }

    public int findHours(int mid , int[] piles){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours += (int)Math.ceil(piles[i] / (double)mid);
        }
        return hours;
    }
}
