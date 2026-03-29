class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxFreq = 0;
        int max = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        while(r<s.length()){
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq = Math.max(maxFreq,map.get(c));
            if(r-l+1-maxFreq>k){
                max=Math.max(max,r-l);    
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
                
            } 
            r++;
            
        }
        return Math.max(max,r-l);
    }
}
