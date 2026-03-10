class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(String s:strs){
            String signature = convert(s);
            map.computeIfAbsent(signature,k->new ArrayList<String>()).add(s);
        }
        List<List<String>> result = new ArrayList<List<String>>();
        for(List<String> ls : map.values()){
            result.add(ls);
        }
        return result;
    }

    public String convert(String s){
        int[] map = new int[26];
        for(char c:s.toCharArray()){
            map[c-'a']++;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<26;i++){
            result.append(map[i]);
            result.append("#");
        }
        return result.toString();
    }
}
