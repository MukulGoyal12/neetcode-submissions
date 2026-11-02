public class Solution {
    public int[] CountBits(int n) {
        int[] setBits = new int[n+1];
        for(int i=0;i<=n;i++){
            setBits[i]=findBits(i);
        }
        return setBits;
    }

    public int findBits(int n){
        int cnt=0;
        while(n!=0){
            cnt++;
            n=n&(n-1);
        }
        return cnt;
    }
}
