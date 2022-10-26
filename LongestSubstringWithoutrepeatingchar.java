class Solution {
    public int lengthOfLongestSubstring(String s) {
    

    int result = 0;
    HashMap<Character,Integer> map = new HashMap<Character, Integer>();    
    
    if(s.length() == 0) return 0;
    
    for(int i = 0, j = 0; i < s.length(); i++) {
        
        char ch = s.charAt(i);
        if(map.containsKey(ch) == true) {
            j = Math.max(j, map.get(ch) + 1);
        }
        
        map.put(ch, i);
        result = Math.max(result, i - j + 1);
    }
    
    return result;
}
}
