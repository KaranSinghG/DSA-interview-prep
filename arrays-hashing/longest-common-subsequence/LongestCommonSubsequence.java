class LongestCommonSubsequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int n:nums){
            set.add(n);
        }
        int max=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int sequenceLength = count(n,set);
                max = sequenceLength>max?sequenceLength:max;
            }
        }
        return max;
    }

    public int count(int n, Set set){
        int c = 0;
        while(set.contains(n++)){
            c++;
        }
        return c;
    }
}
