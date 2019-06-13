class Solution {
    String res = "";
    public String longestPalindrome(String s) {
        if(s == null||s.length() == 0) return s;
        for(int i = 0; i < s.length(); i++){
            //helper();
            findlongest(s,i,i);
            findlongest(s,i,i+1);
        }
        return res;
    }

    public void findlongest(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        String cur = s.substring(left +1, right);
        if(cur.length() > res.length()){
            res =cur;
        }
    }
}
