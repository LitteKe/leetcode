class Solution {
    public boolean isPalindrome(int x) {
        if(x == 10 || x < 0){
            return false;
        }
        String s1 = x + "";
        int n = s1.length() - 1;
        int i = 0;
        while(i < n){
            if(s1.charAt(i) == s1.charAt(n)){
                i++;
                n--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
