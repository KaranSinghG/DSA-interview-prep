class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long min = 1;
        long max = 0;
        for(int b:piles){
            if(b>max){
                max = b;
            }
        }
        long k = 0;
        while(min<=max){
            long mid = min+(max-min)/2;
            long time = 0;
            for(int b:piles){
                if(time>h){
                    break;
                }
                if(b%mid==0){
                    time+=(b/mid);
                } else {
                    time+=(b/mid)+1;
                }
            }
            if(time>h){
                min = mid+1;
            } else {
                k=mid;
                max = mid-1;
            } 
        }
        return (int) k;
    }
}
