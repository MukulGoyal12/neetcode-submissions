class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int n=s.length();
        int cnt=0;
        HashSet<Character> st = new HashSet<>();
        for(int right=0;right<n;right++){
            while(st.contains(s.charAt(right))){
                st.remove(s.charAt(left));
                left++;
            }
            cnt=Math.max(cnt,right-left+1);
            st.add(s.charAt(right));
        }
        return cnt;
    }
}
