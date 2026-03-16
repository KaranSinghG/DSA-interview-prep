class ValidPalidrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        s=s.toLowerCase();
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left)))
                left++;
            else if(!Character.isLetterOrDigit(s.charAt(right)))
                right--;
            else if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isAlphaNumeric(char c){
        return (
            (c>='0' && c<='9') ||
            (c>='a' && c<='z')
        );
    }
}
