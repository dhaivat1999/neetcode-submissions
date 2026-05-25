class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> hash = new HashMap<>();
        for(String str : strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!hash.containsKey(key)) hash.put(key,new ArrayList());
            hash.get(key).add(str);
        }
        return new ArrayList(hash.values());
    }
}
