class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int c = target - nums[i];
            if(map.containsKey(c)){
                int[] res = {map.get(c),i};
                return res;
            } else {
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }
}
