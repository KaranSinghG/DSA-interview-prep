class TimeMap {

    Map<String,List<Value>> map;

    public TimeMap() {
        map = new HashMap<String,List<Value>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).add(new Value(value,timestamp));
        } else {
            List<Value> ls = new ArrayList<Value>();
            ls.add(new Value(value,timestamp));
            map.put(key,ls);
        }
    }
    
    public String get(String key, int timestamp) {
        List<Value> ls = map.get(key);
        if(ls==null){
            return "";
        }
        int l=0;
        int r=ls.size()-1;
        String value = "";
        while(l<=r){
            int m = l+(r-l)/2;
            Value v = ls.get(m);
            if(timestamp==v.getTime()){
                return v.getValue();
            } else if(timestamp<v.getTime()){
                r=m-1;
            } else {
                value=v.getValue();
                l=m+1;
            }
        }
        return value;
    }

}

class Value {
    String value;
    int time;

    public Value(String value, int time){
        this.value = value;
        this.time = time;
    }

    public int getTime(){
        return this.time;
    }

    public String getValue(){
        return this.value;
    }
}
