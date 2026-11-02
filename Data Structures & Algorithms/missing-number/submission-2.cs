public class Solution {
    public int MissingNumber(int[] nums) {
        int total=0;
        int totalNums=0;
        for(int i=0;i<=nums.Length;i++){
            total=total^i;
        }
        for(int i=0;i<nums.Length;i++){
            totalNums=totalNums^nums[i];
        }
        return total^totalNums;
    }
}
