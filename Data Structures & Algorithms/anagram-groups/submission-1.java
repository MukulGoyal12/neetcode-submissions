class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String , List<String>> mp = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            if(!mp.containsKey(sortedString(strs[i]))){
                mp.put(sortedString(strs[i]),new ArrayList<>(Arrays.asList(strs[i])));
            }else{
                List<String> list = mp.get(sortedString(strs[i]));
                list.add(strs[i]);
            }
            
        }
        for(Map.Entry<String, List<String>> entry : mp.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }

    public String sortedString(String strs){
        char[] ch = strs.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
