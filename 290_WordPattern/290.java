public class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null) return false;
        
        
        String[] word = str.split(" ");
        if(pattern.length() != word.length) return false;
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashSet<String> set = new HashSet<String>();
        
        
        
        for(int i=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(set.contains(word[i])) return false;
                set.add(word[i]);
                map.put(pattern.charAt(i),word[i]);
            }
            else{
                String temp = map.get(pattern.charAt(i));
                if(!word[i].equals(temp)) return false;
                
            }
            
        }
        return true;
        
    }
}