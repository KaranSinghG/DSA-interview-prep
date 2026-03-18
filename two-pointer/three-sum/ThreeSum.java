class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            } else {
                int left = i+1;
                int right = nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[left]+nums[right];
                    if(sum>0 ){
                        right--;
                    } else if (sum<0){
                        left++;
                    } else {
                        List<Integer> ls = new ArrayList<Integer>();
                        ls.add(nums[i]);
                        ls.add(nums[left]);
                        ls.add(nums[right]);
                        result.add(ls);
                        while(left<right && nums[left+1]==nums[left]){
                            left++;
                        }
                        while(left<right && nums[right-1]==nums[right]){
                            right--;
                        }
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
