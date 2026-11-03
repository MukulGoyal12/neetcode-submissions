public class Solution {
    public int GetSum(int a, int b) {
        int sum=a^b;
        int carry=a&b;
        while(carry!=0){
            int new_carry = carry<<1;
            carry= sum & new_carry;
            sum = sum^new_carry;
            // sum=new_sum;
        }
        return sum;
    }
}
