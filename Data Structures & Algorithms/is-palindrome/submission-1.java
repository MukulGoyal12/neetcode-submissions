class Solution {
    public boolean isPalindrome(String s) {
        int st=0;
        int e=s.length()-1;
        while(st<e){
            char start=s.charAt(st);
            char end=s.charAt(e);
            if(!Character.isLetterOrDigit(start)){
                st++;
            }
            else if(!Character.isLetterOrDigit(end)){
                e--;
            }else{
                if(Character.toLowerCase(start)!=Character.toLowerCase(end)){
                    return false;
                }
                st++;
                e--;
            }
        }
        return true;
    }
}