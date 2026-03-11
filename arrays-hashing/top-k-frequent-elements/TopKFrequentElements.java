class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n:nums){
            map.compute(n,(key,value)-> (value==null) ? 1 : value+1);
        }
        int[] result = new int[k];

        PriorityQueue<Map.Entry<Integer,Integer>> heap = 
            new PriorityQueue<Map.Entry<Integer,Integer>>(
                (a,b)->a.getValue()-b.getValue()
        );
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }

        for(int i=0;i<k;i++){
            result[i]=heap.poll().getKey();
        }
        return result;
    }
}
