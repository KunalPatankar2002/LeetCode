class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        HashMap<HashMap<Character,Integer>,List<String>> grams = new HashMap<HashMap<Character,Integer>,List<String>>();
        
        for(String s: strs){
            HashMap<Character,Integer> sign = new HashMap<Character,Integer>();
            for( char c: s.toCharArray()){
                sign.put(c,sign.getOrDefault(c, 0) + 1);
            }
            List<String> t = grams.getOrDefault(sign,new ArrayList<String>());
            t.add(s);
            grams.put(sign,t);
        }
        List<List<String>> ans = new ArrayList<>();
        ans.addAll(grams.values());
        return ans;
    }
}