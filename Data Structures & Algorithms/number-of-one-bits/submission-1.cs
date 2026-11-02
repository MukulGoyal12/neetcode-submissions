public class Solution {
    public int HammingWeight(uint n) {
        int cnt=0;
        while(n!=0){
            n=n&(n-1);
            cnt++;
        }
        return cnt;
    }
}
