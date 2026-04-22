class MinStack {
    int[] arr;
    int[] minArr;
    int size;
    public MinStack() {
        size=0;
        arr = new int[2];
        minArr=new int[2];
    }
    
    public void push(int val) {
        if(size==arr.length){
            int[] nArr = new int[size*2];
            int[] nMinArr = new int[size*2];
            for(int i=0;i<arr.length;i++){
                nArr[i]=arr[i];
                nMinArr[i]=minArr[i];
            }
            arr=nArr;
            minArr=nMinArr;
        }
        arr[size]=val;
        if(size==0){
            minArr[size]=val;
        } else {
            if(minArr[size-1]>val){
                minArr[size]=val;
            }else{
                minArr[size]=minArr[size-1];
            }
        }
        size++;
        
    }
    
    public void pop() {
        if(size!=0){
            size--;
        }
    }
    
    public int top() {
        if(size!=0){
            return arr[size-1];
        }
        return 0;
    }
    
    public int getMin() {
        if(size!=0){
            return minArr[size-1];
        }
        return 0;
    }
}
