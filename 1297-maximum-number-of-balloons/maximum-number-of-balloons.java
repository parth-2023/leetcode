class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map= new HashMap<>();
        for(char c : "balon".toCharArray()) {
            map.put(c, 0);
        }
        for(char c:text.toCharArray()){
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        if (map.containsKey('l')) map.put('l', map.get('l')/2);
        if (map.containsKey('o')) map.put('o', map.get('o')/2);
        int res=Integer.MAX_VALUE;
        for(int a:map.values()){
            res=Math.min(a, res);
        }
        return res;
    }
}