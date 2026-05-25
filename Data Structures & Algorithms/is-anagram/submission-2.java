class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hash = new HashMap<>();
        for(char ch: s.toCharArray()){
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        for(char ch: t.toCharArray()){
            if(hash.containsKey(ch)) hash.put(ch,hash.getOrDefault(ch,0)-1);
            else return false; 
        }
        for(Character ch: hash.keySet()){
            if(hash.get(ch) != 0 ) return false;
        }
        return true;
    }
}
