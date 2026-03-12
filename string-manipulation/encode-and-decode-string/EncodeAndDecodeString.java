class EncodeAndDecodeString {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String s: strs){
            encoded.append(s.length());
            encoded.append("#");
            encoded.append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        StringBuilder length = new StringBuilder();
        List<String> decoded = new ArrayList<String>();
        int index=0;
        while(index<str.length()){
            if(str.charAt(index)=='#'){
                int l = Integer.parseInt(length.toString());
                decoded.add(str.substring(index+1,index+1+l));
                index+=(l+1);
                length = new StringBuilder();
            } else {
                length.append(str.charAt(index++));
            }
        }
        return decoded;
    }
}
