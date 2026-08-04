class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' ' && ((int)ch>=97 && (int)ch<=122) || ((int)ch>=65 && (int)ch<=90) || ((int)ch>=48 && (int)ch<=57)){
                sb.append(ch);
            }
        }

        String updated=sb.toString();
        updated=updated.toLowerCase();
        // System.out.print((int)'9');
        int st=0;
        int e=updated.length()-1;
        while(st<e){
            if(updated.charAt(st)!=updated.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;
    }
}
