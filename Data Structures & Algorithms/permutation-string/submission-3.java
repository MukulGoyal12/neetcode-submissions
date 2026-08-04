class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if (n1 > n2) return false;
        int i=0;
        int j=0;
        int[] arr= new int[26];
        int[] ans= new int[26];
        for(int k=0;k<n1;k++){
            arr[s1.charAt(k)-'a']++;
        }
        while(j<n1){
            ans[s2.charAt(j)-'a']++;
            j++;
        }
        while(j<n2){
            if(Arrays.equals(arr,ans)){
                return true;
            }else{ 
                ans[s2.charAt(i)-'a']--;
                i++;
                ans[s2.charAt(j)-'a']++;
                j++;
            }
        }
        return Arrays.equals(arr, ans);
    }
}
