class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        for(String s:strs){
            char[]charArray=s.toCharArray();
            Arrays.sort(charArray);
            String sorted_string=new String(charArray);
            map.putIfAbsent(sorted_string, new ArrayList<String>());
            map.get(sorted_string).add(s);
        }
        return new ArrayList<>(map.values());
    }
}