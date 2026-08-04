class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(strs[0])));
        for(int i=1;i<strs.length;i++){
            int cnt=0;
            for(int j=0;j<ans.size();j++){
                if(validAnagram(createAnagram(ans.get(j).get(0)) ,createAnagram(strs[i]))){
                    ans.get(j).add(strs[i]);
                    break;
                }
                cnt++;
            }
            if(cnt==ans.size())
                ans.add(new ArrayList<>(Arrays.asList(strs[i])));
        }
        return ans;
    }

    public Map< Character, Integer> createAnagram(String word){
        Map< Character, Integer> mp = new HashMap<>();
        for(int i=0;i<word.length();i++){
            mp.put(word.charAt(i), mp.getOrDefault(word.charAt(i),0)+1);
        }
        return mp;
    }

    public boolean validAnagram(Map< Character, Integer> anagram1 , Map< Character, Integer> anagram2){
        return anagram1.equals(anagram2);
    }
}
