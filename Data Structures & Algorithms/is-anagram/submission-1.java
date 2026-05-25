class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> hash = new HashMap<>();
        for(Character ch:s.toCharArray()){
            hash.put(ch,hash.getOrDefault(ch,0)+1);
        }
        for(Character ch:t.toCharArray()){
            if(!hash.containsKey(ch)) return false;
            hash.put(ch,hash.getOrDefault(ch,0)-1);
        }
        for(int count : hash.values()){
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}
