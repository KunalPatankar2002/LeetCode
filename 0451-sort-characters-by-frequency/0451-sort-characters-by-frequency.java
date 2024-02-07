class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> sign = new HashMap<Character,Integer>();
        for( char c: s.toCharArray()){
            sign.put(c,sign.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(sign.entrySet());
        System.out.println(pq);
        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            ans.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return ans.toString();
    }
}